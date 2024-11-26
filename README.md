curl --location --request GET 'localhost:8080/api/response/conversion' \
--header 'Content-Type: application/json' \
--data '{
    "content": {
        "Fyear": "2024",
        "Srno": "1",
        "CatName": "Petrol",
        "Location": "MYS",
        "Uom": "KL",
        "Apr": "27.442",
        "May": "31.569",
        "June": "25.421",
        "July": "26.443",
        "Aug": "23.148",
        "Sep": "0.000",
        "Oct": "0.000",
        "Nov": "0.000",
        "Decm": "0.000",
        "Jan": "0.000",
        "Feb": "0.000",
        "March": "0.000",
        "Total": "53.000"
    }
}'
response:
[
    {
        "location": "MYS",
        "code": "Petrol",
        "month": 6,
        "value": 25.421,
        "year": 2023,
        "unit": "KL"
    },
    {
        "location": "MYS",
        "code": "Petrol",
        "month": 10,
        "value": 0.0,
        "year": 2023,
        "unit": "KL"
    },
    {
        "location": "MYS",
        "code": "Petrol",
        "month": 4,
        "value": 27.442,
        "year": 2023,
        "unit": "KL"
    },
    {
        "location": "MYS",
        "code": "Petrol",
        "month": 8,
        "value": 23.148,
        "year": 2023,
        "unit": "KL"
    },
    {
        "location": "MYS",
        "code": "Petrol",
        "month": 2,
        "value": 0.0,
        "year": 2024,
        "unit": "KL"
    },
    {
        "location": "MYS",
        "code": "Petrol",
        "month": 5,
        "value": 31.569,
        "year": 2023,
        "unit": "KL"
    },
    {
        "location": "MYS",
        "code": "Petrol",
        "month": 11,
        "value": 0.0,
        "year": 2023,
        "unit": "KL"
    },
    {
        "location": "MYS",
        "code": "Petrol",
        "month": 1,
        "value": 0.0,
        "year": 2024,
        "unit": "KL"
    },
    {
        "location": "MYS",
        "code": "Petrol",
        "month": 3,
        "value": 0.0,
        "year": 2024,
        "unit": "KL"
    },
    {
        "location": "MYS",
        "code": "Petrol",
        "month": 7,
        "value": 26.443,
        "year": 2023,
        "unit": "KL"
    },
    {
        "location": "MYS",
        "code": "Petrol",
        "month": 12,
        "value": 0.0,
        "year": 2023,
        "unit": "KL"
    },
    {
        "location": "MYS",
        "code": "Petrol",
        "month": 9,
        "value": 0.0,
        "year": 2023,
        "unit": "KL"
    }
]
