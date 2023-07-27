public enum Food {
    CHURU("ちゅ〜るまぐろ味"), KATSUOBUSHI("鰹節"), NIBOSHI("にぼし");

    private String name;

    private Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

