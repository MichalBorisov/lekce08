package com.company;

import java.io.IOException;

public interface IPrintInfo {
    public void PrintInfoFormatA();
    public void PrintInfoFormatB();
    public void PrintInfoToFileFormatA(String filePath) throws IOException;
    public void PrintInfoToFileFormatB(String filePath) throws IOException;
}
