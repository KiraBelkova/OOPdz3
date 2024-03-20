public class Main {
    public static void main(String[] args) {
        List<Group> groups1 = new ArrayList<>();
        groups1.add(new Group("Group 1"));
        groups1.add(new Group("Group 2"));

        List<Group> groups2 = new ArrayList<>();
        groups2.add(new Group("Group 1"));
        groups2.add(new Group("Group 2"));
        groups2.add(new Group("Group 3"));

        Stream stream1 = new Stream(groups1);
        Stream stream2 = new Stream(groups2);

        StreamComparator.compare(stream1, stream2);
    }
}
