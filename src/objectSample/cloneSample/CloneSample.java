package objectSample.cloneSample;

class CloneSample {
    public static void main(String[] args) {
        Node node = new Node("abc");

        //クローンメソッドを実装している場合
        Sample sample1 = new Sample(10,node);
        Sample sample2 = sample1.clone();

        sample1.setNum(20);
        sample1.setNode(new Node("xyz"));
        System.out.println(sample1);
        System.out.println(sample2);

    }
}
