package com.example.zeplaces

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonObject
import okhttp3.ResponseBody.Companion.toResponseBody

val mockResponse ="""{
  "html_attributions": [],
  "results": [
    {
      "business_status": "OPERATIONAL",
      "geometry": {
        "location": {
          "lat": -33.8587323,
          "lng": 151.2100055
        },
        "viewport": {
          "northeast": {
            "lat": -33.85739847010727,
            "lng": 151.2112436298927
          },
          "southwest": {
            "lat": -33.86009812989271,
            "lng": 151.2085439701072
          }
        }
      },
      "icon": "https://maps.gstatic.com/mapfiles/place_api/icons/v1/png_71/bar-71.png",
      "icon_background_color": "#FF9E67",
      "icon_mask_base_uri": "https://maps.gstatic.com/mapfiles/place_api/icons/v2/bar_pinlet",
      "name": "Cruise Bar",
      "opening_hours": {
        "open_now": false
      },
      "photos": [
        {
          "height": 608,
          "photo_reference": "Aap_uECvJIZuXT-uLDYm4DPbrV7gXVPeplbTWUgcOJ6rnfc4bUYCEAwPU_AmXGIaj0PDhWPbmrjQC8hhuXRJQjnA1-iREGEn7I0ZneHg5OP1mDT7lYVpa1hUPoz7cn8iCGBN9MynjOPSUe-UooRrFw2XEXOLgRJ-uKr6tGQUp77CWVocpcoG",
          "width": 1080
        }
      ],
      "place_id": "ChIJi6C1MxquEmsR9-c-3O48ykI",
      "plus_code": {
        "compound_code": "46R6+G2 The Rocks, New South Wales",
        "global_code": "4RRH46R6+G2"
      },
      "price_level": 2,
      "rating": 4.0,
      "reference": "ChIJi6C1MxquEmsR9-c-3O48ykI",
      "scope": "GOOGLE",
      "types": [
        "bar",
        "restaurant",
        "food",
        "point_of_interest",
        "establishment"
      ],
      "user_ratings_total": 1269,
      "vicinity": "Level 1, 2 and 3, Overseas Passenger Terminal, Circular Quay W, The Rocks"
    }
  ],
  "status": "OK"
}
""".trimIndent()
