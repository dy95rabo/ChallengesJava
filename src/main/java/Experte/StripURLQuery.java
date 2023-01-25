package main.java.Experte;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StripURLQuery {
    /*
     * Strip URL Query Parameters
     * 
     * Create a function that takes a URL (string), removes duplicate query
     * parameters and parameters specified within the 2nd argument (which will be an
     * optional array).
     * Examples
     * 
     * stripUrlParams("https://edabit.com?a=1&b=2&a=2") ➞
     * "https://edabit.com?a=2&b=2"
     * 
     * stripUrlParams("https://edabit.com?a=1&b=2&a=2", ["b"]) ➞
     * "https://edabit.com?a=2"
     * 
     * stripUrlParams("https://edabit.com", ["b"]) ➞ "https://edabit.com"
     * 
     * Notes
     * 
     * The 2nd argument paramsToStrip is optional.
     * paramsToStrip can contain multiple params.
     * If there are duplicate query parameters with different values, use the value
     * of the last occurring parameter (see examples #1 and #2 above).
     */
    public static String stripUrlParams(String url, String[] paramsToStrip) {
        if (!url.contains("?")) {
            return url;
        }
        Map<String, String> queries = new HashMap<>();
        for (String pair : url.substring(url.indexOf("?") + 1).split("&")) {
            String[] keyValuePairs = pair.split("=");
            queries.put(keyValuePairs[0], keyValuePairs[1]);
        }
        return url.substring(0, url.indexOf("?") + 1) + queries.entrySet().stream()
                .filter(k -> paramsToStrip == null ? true : !Arrays.asList(paramsToStrip).contains(k.getKey()))
                .map(e -> e.getKey() + "=" + e.getValue())
                .collect(Collectors.joining("&"));
    }

    public static void main(String[] args) {
        System.out.println(stripUrlParams("https://edabit.com?a=1&b=2&c=3&d=4", new String[] { "a", "d" }));

        System.out.println(stripUrlParams("https://edabit.com?a=1&b=2&c=3&d=4&c=5", new String[] { "a", "d" }));
    }
}
