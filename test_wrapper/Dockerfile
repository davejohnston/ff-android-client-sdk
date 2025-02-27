FROM fedora:34

ARG PORT
ARG SELF_TEST
ARG WRAPPERS_BRANCH

ENV PORT "$PORT"
ENV SELF_TEST "$SELF_TEST"
ENV WRAPPERS_BRANCH "$WRAPPERS_BRANCH"

RUN dnf group install -y "Development Tools" && \
    sudo dnf install -y https://mirrors.rpmfusion.org/free/fedora/rpmfusion-free-release-$(rpm -E %fedora).noarch.rpm \
        https://mirrors.rpmfusion.org/nonfree/fedora/rpmfusion-nonfree-release-$(rpm -E %fedora).noarch.rpm && \
    dnf install -y wget java java-devel && \
    wget "https://dl.google.com/android/repository/commandlinetools-linux-7302050_latest.zip" && \
    unzip "commandlinetools-linux-7302050_latest.zip" && \
    mkdir -p /Android && cd /cmdline-tools/bin && \
    echo y | ./sdkmanager "platform-tools" "platforms;android-30" "sources;android-30" \
        "build-tools;30.0.3" "add-ons;addon-google_apis-google-24" "cmdline-tools;latest" --sdk_root="/Android" && \
    cd / && wget "https://downloads.gradle-dn.com/distributions/gradle-7.0-bin.zip" && \
    unzip "gradle-7.0-bin.zip"

RUN mkdir CFAndroidSDK && cd ./CFAndroidSDK && \
    git clone --recurse-submodules https://github.com/harness/ff-android-client-sdk.git . && \
    echo "Wrappers branch: $WRAPPERS_BRANCH" && \
    git checkout "$WRAPPERS_BRANCH" && \
    git submodule init && git submodule update && \
    echo "sdk.dir=/Android" > local.properties && \
    ../gradle-7.0/bin/gradle wrapper --gradle-version 7.0 && ../gradle-7.0/bin/gradle --stop

EXPOSE $PORT

CMD cd ./CFAndroidSDK && git fetch && git pull && \
    echo "{\"selfTest\": $SELF_TEST, \"port\": $PORT, \"sdkKey\": \"$SDK_KEY\", \"logger\": \"filesystem\", \"enableStreaming\": $ENABLE_STREAMING, \"eventUrl\": \"$EVENT_URL\", \"sdkBaseUrl\": \"$SDK_BASE_URL\"}" \
        > "test_wrapper/wrapper.json" && \
    echo "wrapper.json:" && cat "test_wrapper/wrapper.json" && \
    echo "Preparing the build" && \
    ./gradlew --stop && ./gradlew clean --stacktrace && \
    echo "Assembling the build" && \
    ./gradlew test_wrapper:assemble --stacktrace && \
    echo "Running" && \
    ./gradlew test_wrapper:test --stacktrace
