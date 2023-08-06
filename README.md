# github-handson
# 第7回講義動画　REST APIhandson
### GETリクエスト
- ターミナル curl 結果  
```
maesakamisato@seimatsusatootonoiMac ~ % curl -i -u MisatoMaesaka:mytoken https://api.github.com/user
HTTP/2 200 
server: GitHub.com
date: Sun, 06 Aug 2023 13:10:22 GMT
content-type: application/json; charset=utf-8
...
{
  "login": "MisatoMaesaka",
...
  "created_at": "2023-07-11T00:36:30Z",
  "updated_at": "2023-08-05T05:53:32Z"
}
```
- Postman 結果
<img width="1482" alt="スクリーンショット 2023-08-06 23 53 01" src="https://github.com/MisatoMaesaka/github-handson/assets/139186715/452d6a36-1ee5-4583-a5f8-3c9d8232fd43">
### POSTリクエスト
- curl & ターミナル
```

