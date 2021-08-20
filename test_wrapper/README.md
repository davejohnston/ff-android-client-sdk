# Test wrapper module

## Configuration

Make sure that the configuration file is defined (`wrapper.json`):

```json
{
  "selfTest": true,
  "port": 4000,
  "sdkKey": "YOUR_SDK_KEY",
  "enableStreaming": true,
  "eventUrl": "https://events.ff.harness.io/api/1.0",
  "sdkBaseUrl": "https://config.ff.harness.io/api/1.0",
  "logger": "default"
}
```

## Running test wrapper inside a container

Or, to run test wrapper inside the Docker container build and run Dockerfile with following arguments:

- Build arguments:

-- `PORT` represents the port that will be used

- Environment variables:

-- `SDK_KEY` represents your FF SDK KEY
-- `ENABLE_STREAMING` True if we want to receive SSE events from the server
-- `EVENT_URL` represents FF SDK SSE endpoint
-- `SDK_BASE_URL` represents FF SDK base endpoint.

Docker image will be created and container started.

## Using test wrapper

Test wrapper will be listening for the API calls on provided port. The following CURL commands 
illustrate the use:

- Ping:

```
curl -X GET -H "content-type: application/json" http://localhost:4000/api/1.0/ping
```

Response:

```json
{"pong":true}
```

- Feature flag check:

```
curl -X POST -d '{"flag_kind": "boolean", "flag_key": "flag1", "target": {"target_identifier": "test", "target_name": "test"}}' \
 -H "content-type: application/json" http://localhost:4000/api/1.0/check_flag
```

Response:

```json
{"flag_key":"flag1","flag_value":"true"}
```
