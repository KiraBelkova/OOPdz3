class StreamComparator {
    public static void compare(Stream stream1, Stream stream2) {
        int numberOfGroups1 = 0;
        int numberOfGroups2 = 0;

        for (Group group : stream1) {
            numberOfGroups1++;
        }

        for (Group group : stream2) {
            numberOfGroups2++;
        }

        if (numberOfGroups1 > numberOfGroups2) {
            System.out.println("Stream 1 has more groups.");
        } else if (numberOfGroups1 < numberOfGroups2) {
            System.out.println("Stream 2 has more groups.");
        } else {
            System.out.println("Both streams have the same number of groups.");
        }
    }
}

