public class Main {
    public static void main(String[] args){
        PbList gs25 = new PbList(3);
        PbList cu = new PbList(2);

        gs25.addPB(new PrivateBrand("풀)참치마요", 1500, 4.5));
        gs25.addPB(new PrivateBrand("풀)제육쌈밥", 1600, 3));
        gs25.addPB(new PrivateBrand("편스)진또계란프라이짜장", 1700, 4));

        cu.addPB(new PrivateBrand("연세우유 우유생크림빵", 2700, 4.8));
        cu.addPB(new PrivateBrand("연세우유 황치즈생크림빵", 3300, 4.2));

        // Iterator 객체 생성
        PbListIterator gsIterator = gs25.iterator();
        PbListIterator cuIterator = cu.iterator();

        System.out.println("------GS25 전체상품------");
        while(gsIterator.hasNext()){
            PrivateBrand pb = (PrivateBrand) gsIterator.next(); // 다음 객체 반환
            System.out.println(pb.getName());
            System.out.println("가격 : " + pb.getCost());
            System.out.println("평점 : " + pb.getScore());
        }

        System.out.println("------CU 전체상품------");
        while(cuIterator.hasNext()){
            PrivateBrand pb2 = (PrivateBrand) cuIterator.next(); // 다음 객체 반환
            System.out.println(pb2.getName());
            System.out.println("가격 : " + pb2.getCost());
            System.out.println("평점 : " + pb2.getScore());
        }
    }
}
