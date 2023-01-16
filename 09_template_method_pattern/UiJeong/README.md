![image](https://user-images.githubusercontent.com/63052097/210230722-ce23ab76-b051-482e-aa6c-bd96049afe8b.png)       

Sceneform을 적용해서 Ar App을 만들 때 모델을 렌더링하는 과정에 템플릿 메소드 패턴을 적용
- Anchor -> 모델 렌더링할 수 있게 만들고(ModelRenderable) 새로운 앵커 노드 생성 후 모델 렌더링
- CloudAnchor -> 모델 렌더링할 수 있게 만들고(ModelRenderable) 클라우드 앵커 노드를 가져와서 모델 렌더링
