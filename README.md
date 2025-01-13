# Weather Dashboard

A Spring Boot application that demonstrates integration with the OpenWeatherMap API.

## Setup

1. Get an API key from [OpenWeatherMap](https://openweathermap.org/api)

2. Set your API key as an environment variable:

   ```bash
   # For Linux/Mac
   export WEATHER_API_KEY=your_api_key_here

   # For Windows (Command Prompt)
   set WEATHER_API_KEY=your_api_key_here

   # For Windows (PowerShell)
   $env:WEATHER_API_KEY="your_api_key_here"
   ```

3. Build the project:
   ```bash
   mvn clean install
   ```

4. Run the application:
   ```bash
   mvn spring-boot:run
   ```

5. Test the API:
   ```bash
   curl http://localhost:8080/api/weather/London
   ```

## API Endpoints

- GET `/api/weather/{city}` - Get weather information for a specific city

## Development

To run locally:
1. Copy your API key
2. Set it as an environment variable:
   ```bash
   # Windows Command Prompt
   set WEATHER_API_KEY=your_api_key_here
   
   # Windows PowerShell
   $env:WEATHER_API_KEY="your_api_key_here"
   ```
3. Run `mvn spring-boot:run`

## Security Note

Never commit API keys or sensitive credentials to version control. The API key shown in this README is for demonstration purposes only. 
