그림판의 상태에 따라 캔버스를 저장하는 로직을 구현해보았습니다. 

<br>

<img src="https://user-images.githubusercontent.com/63052097/214023964-ae155eb1-edcb-4b75-978b-b224047a1d5b.png" width=500 />

- EmptyCanvas           
: 빈 캔버스           
: save - 상태변환 일어나지 않는다.            
: exit - 아무런 일이 일어나지 않는다.             
: paint - PaintingCanvas로 상태변환       

<br>

- PaintingCanvas        
: 그림이 그려진 캔버스          
: save - EmptyCanvse로 상태변환          
: exit - 그림을 저장하라는 경고문이 뜬다.               
: paint - 상태변환 일어나지 않는다.         

![image](https://user-images.githubusercontent.com/63052097/214029181-9b82ec87-2601-4f47-bc29-6256f5d52630.png)


