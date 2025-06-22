# 🕓 Timezone Service – Scala Akka HTTP + TimeZoneDB

A simple proof-of-concept HTTP service built using **Scala**, **Akka HTTP**, and **Spray JSON** that fetches timezone information based on latitude and longitude using the [TimeZoneDB API](https://timezonedb.com/).

---

## 🚀 Features

- HTTP endpoint to query timezone by `lat` and `lon`
- Integration with [TimeZoneDB](https://timezonedb.com/)
- JSON marshalling with Spray
- Built with Akka HTTP and Akka Typed
- 
---

## 🔧 Setup

1. **Get a TimeZoneDB API Key:**
   Create a free account at https://timezonedb.com and get your API key.


📡 API Usage
GET /timezone

  Query Parameters:
  |Name|Type|Description|
  |---|---|---|
  |lat|Double|Latitude (e.g. 40.71)|
  |lon|Double|Longitude (e.g. -74.0)|

## Example
```curl "http://localhost:8080/timezone?lat=40.7128&lon=-74.0060"```

```
{
  "location": "America/New_York",
  "timezone": "EDT",
  "utc_offset": "-14400",
  "currentTime": "2025-06-22 11:45:32"
}
```
