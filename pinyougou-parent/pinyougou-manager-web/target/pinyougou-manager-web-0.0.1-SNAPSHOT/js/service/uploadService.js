/*app.service('uploadService',function($http){
	this.uploadFile=function(){
		var formdata=new FormData();
		formdata.append('file',file.files[0]);
		return $http({
			url:'../upload.do',
			method:'post',
			data:formdata,
			headers:{'Content-Type':undefined},
			trandformRequest:angular.identity
		});
	}
});*/
app.service("uploadService",function($http){
	this.uploadFile=function(){
		var formData=new FormData();
	    formData.append("file",file.files[0]);   
		return $http({
            method:'POST',
            url:"../upload.do",
            data: formData,
            headers: {'Content-Type':undefined},
            transformRequest: angular.identity
        });		
	}	
});