package io.harness.cfsdk;

/**
 * Main configuration class used to tune the behaviour of {@link CfClient}. It uses builder pattern.
 */
public class CfConfiguration {

    private static final String BASE_URL;
    private static final String STREAM_URL;

    static {

        BASE_URL = "https://config.feature-flags.uat.harness.io/api/1.0";
        STREAM_URL = BASE_URL + "/stream";
    }

    private final String baseURL;
    private final String streamURL;
    private final int pollingInterval;
    private final boolean streamEnabled;
    private final boolean analyticsEnabled;

    CfConfiguration(

            String baseURL,
            String streamURL,
            boolean streamEnabled,
            boolean analyticsEnabled,
            int pollingInterval
    ) {

        this.baseURL = baseURL;
        this.streamURL = streamURL;
        this.streamEnabled = streamEnabled;
        this.pollingInterval = pollingInterval;
        this.analyticsEnabled = analyticsEnabled;
    }

    public String getBaseURL() {
        return baseURL;
    }

    public String getStreamURL() {
        return streamURL;
    }

    public boolean getStreamEnabled() {
        return streamEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public int getPollingInterval() {
        return pollingInterval;
    }

    public static class Builder {

        private String baseURL;
        private String streamURL;
        private int pollingInterval;
        private boolean streamEnabled;
        private boolean analyticsEnabled;

        /**
         * Sets the base API url
         */
        public Builder baseUrl(String baseURL) {

            this.baseURL = baseURL;
            return this;
        }

        /**
         * Sets the stream url to be used for realtime evaluation update
         */
        public Builder streamUrl(String streamURL) {

            this.streamURL = streamURL;
            return this;
        }

        /**
         * Configuration to explicitly enable or disable analytics. If enabled, SDK metrics will be used.
         */
        public Builder enableAnalytics(boolean analyticsEnabled) {

            this.analyticsEnabled = analyticsEnabled;
            return this;
        }

        /**
         * Configuration to explicitly enable or disable stream. If enabled, the stream url must be valid.
         */
        public Builder enableStream(boolean streamEnabled) {

            this.streamEnabled = streamEnabled;
            return this;
        }

        /**
         * Polling interval to use when getting new evaluation data from server
         */
        public Builder pollingInterval(int pollingInterval) {

            this.pollingInterval = pollingInterval;
            return this;
        }

        public CfConfiguration build() {

            if (baseURL == null || baseURL.isEmpty()) {
                baseURL = BASE_URL;
            }
            if (streamEnabled && (streamURL == null || streamURL.isEmpty())) {
                streamURL = STREAM_URL;
            }
            return new CfConfiguration(

                    baseURL, streamURL, streamEnabled, analyticsEnabled, pollingInterval
            );
        }
    }
}
