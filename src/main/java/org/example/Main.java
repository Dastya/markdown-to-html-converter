package org.example;

import org.markdownj.MarkdownProcessor;

public class Main {
    public static void main(String[] args) {
        String markdownText = "1. Remember to use double quotation marks when outputting text. The command for output is `System.out.println()`;\n" +
                "2. Also, don't forget about using **semicolon** (``;``) at the end of every line. It will look like this: \n" +
                "``System.out.println();``.\n";

        MarkdownProcessor markdownProcessor = new MarkdownProcessor();
        String htmlText = markdownProcessor.markdown(markdownText);

        System.out.println(htmlText);
    }
}
