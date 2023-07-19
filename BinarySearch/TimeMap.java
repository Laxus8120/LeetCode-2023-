class TimeMap {
    private Map<String, List<Pair>> map;

    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(new Pair(timestamp, value));
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) {
            return "";
        }
        List<Pair> pairs = map.get(key);
        int idx = binarySearch(pairs, timestamp);
        if (idx == -1) {
            return "";
        }
        return pairs.get(idx).value;
    }

    private int binarySearch(List<Pair> pairs, int timestamp) {
        int left = 0;
        int right = pairs.size() - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midTimestamp = pairs.get(mid).timestamp;
            if (midTimestamp == timestamp) {
                return mid;
            } else if (midTimestamp < timestamp) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    private static class Pair {
        int timestamp;
        String value;

        public Pair(int timestamp, String value) {
            this.timestamp = timestamp;
            this.value = value;
        }
    }
}