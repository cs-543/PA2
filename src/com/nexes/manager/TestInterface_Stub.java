import Rpc.*;
import java.net.Socket;
import java.io.IOException;

public class TestInterface_Stub extends Stub implements TestInterface {
    public TestInterface_Stub(Socket s, String uri) throws IOException {
        super(s, uri);
    }

    @Override
    public void listfiles() throws Exception {
        Call call = new Call("listfiles");
        invoke(call);
    }
    
    @Override
    public boolean isDir(String filename) throws Exception {
        Call call = new Call("isDir", filename);
        return invoke(call);
    }
    
    @Override
    public void move(String old_path, String new_path) throws Exception {
        Call call = new Call("move", old_path, new_path);
        invoke(call);
    }
    
    @Override
    public void copy(String old_path, String new_path) throws Exception {
        Call call = new Call("copy", old_path, new_path);
        invoke(call);
    }
    
    @Override
    public void delete(String path) throws Exception {
        Call call = new Call("delete", path);
        invoke(call);
    }
    
    @Override
    public void cd(String path) throws Exception {
        Call call = new Call("cd", path);
        invoke(call);
    }
}
