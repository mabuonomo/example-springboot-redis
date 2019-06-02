# Example - Spring boot with Redis as Cache, Database and Message broker

## Usage

```bash
make build
make start
```

## Example

### Message
```bash
http://localhost:8080/message/get
```

### Database
```bash
http://localhost:8080/database/save
http://localhost:8080/database/get

http://localhost:8080/database/add
http://localhost:8080/database/all
```