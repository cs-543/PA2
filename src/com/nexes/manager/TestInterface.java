package com.nexes.manager;

import Rpc.*;

public interface TestInterface {
    void listfiles() throws Exception;
    
    boolean isDir(String filename) throws Exception;
    
    void move(String old_path, String new_path) throws Exception;
    
    void copy(String old_path, String new_path) throws Exception;
    
    void delete(String path) throws Exception;
    
    void cd(String path) throws Exception;
}
