function header(rootDir){
    $.ajax({
        url: rootDir + "header.JSP", // 読み込むJSPファイル
        cache: false,
        async: false,
        dataType: 'html',
        success: function(html){
            html = html.replace(/\{\$root\}/g, rootDir); //header.jspの{$root}を置換
            document.write(html);
        }
    });
}