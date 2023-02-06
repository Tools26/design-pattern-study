public class DownloadFile implements Download{
    private String file;

    public DownloadFile(String file) {
        this.file = file;
    }

    public int time(String file){
        String test = file.substring(file.length()-3,file.length());
        if(test.equals("pdf")){ // test == "pdf"면 false라고 뜬다..
            return 5;
        }else if(test.equals("txt")){
            return 3;
        }
        else{
            return 2;
        }
    }

    private void loading(String file){
        System.out.println(file+" 다운로드 중입니다.");
    }

    @Override
    public void downloadFile() {
        int t = time(file);

        for(int i=0; i < t; i++){
            loading(file);
            System.out.println("남은 시간 : " + (t-i) + "초");
        }

        System.out.println(this.file+" 다운로드 완료 되었습니다 \n");
    }
}
