public class Proxy_DownloadFile implements Download{
    private String file;
    private DownloadFile downloadFile;

    public Proxy_DownloadFile(String file) {
        this.file = file;
    }

    @Override
    public void downloadFile() {
        if(downloadFile == null){
            downloadFile = new DownloadFile(file);
        }

        downloadFile.downloadFile();
    }
}
