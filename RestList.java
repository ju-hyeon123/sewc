package com.example.mission3;

public class RestList {
    RestListResult areaResult;
}

6. [RestListResult.java]

package com.example.mission3;

import java.util.ArrayList;

public class RestListResult {
    String Type;
    String showRange;

    ArrayList<Rest> dailyList = new ArrayList<Rest>();
}
