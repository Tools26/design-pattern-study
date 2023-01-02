public abstract class ModelRenderable { // 객체를 앱 화면에 출력할 때 렌더링 가능한 모델로 만들어주고 빌드시키는 빌더 설정
    public void createModel(int i){
        setSource(i);
        setIsFilenametGltf();
        setAsyncLoadEnabled();
        build();
        thenAccept();
        System.out.println("~~Rendering~~");
    }

    /* 하위 클래스에서 재정의 해야 하는 메소드*/
    protected void setSource(int i){ // 객체 소스 설정
        if(i == 1){
            System.out.println("Tech 나와라");
        }
        else{
            System.out.println("아휴 나와라");
        }
    };
    protected void setIsFilenametGltf(){
        System.out.println("오브젝트 확장자는 gltf");
    };
    protected void setAsyncLoadEnabled(){
        System.out.println("모델을 비동기로 load해랏");
    };
    protected void build(){
        System.out.println("build해라");
    };

    /* 하위 클래스에서 재정의 해야 하는 메소드*/
    protected abstract void thenAccept(); // 접근할 때 처리

}
