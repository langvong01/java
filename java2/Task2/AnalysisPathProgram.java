package ADF2.Task2;

public class AnalysisPathProgram {
    String path;

    public String inputPath(String str) throws Exception {
        try {
            this.path = str;
            if (path.contains(" ")) {
                throw new Exception("This path cannot enter the whitespace ");
            }
        } catch (NullPointerException e) {
            throw new Exception("Ko tim thay duong dan");
        }
        return path;
    }

    public String getDisk(AnalysisPathProgram another) throws Exception {
        if ((int) (path.charAt(0)) > 65 && (int) (path.charAt(0)) < 90 || (int) (path.charAt(0)) > 97 && (int) (path.charAt(0)) < 122) {
            return path.charAt(0) + ":";
        } else {
            throw new Exception("Ko tim thay  duong dan");
        }
    }

    public String getPath(AnalysisPathProgram another){

            return path.charAt(0) + ":" + path.substring(path.indexOf("\\"), path.lastIndexOf("\\"));

        }

        public String getFolder (AnalysisPathProgram another){

            return "[" + path.substring(path.indexOf("\\") + 1, path.lastIndexOf("\\")) + "]";
        }
        public  String getFileName(AnalysisPathProgram another) {
            return path.substring(path.lastIndexOf("\\")+1,path.indexOf("."));
        }
        public String getExtension(AnalysisPathProgram another){
                return path.substring(path.indexOf(".")+1,path.length());
        }
    }

