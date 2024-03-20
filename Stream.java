class Stream implements Iterable<Group> {
    private List<Group> groups;

    public Stream(List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public Iterator<Group> iterator() {
        return groups.iterator();
    }
}
