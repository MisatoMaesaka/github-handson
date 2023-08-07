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
maesakamisato@seimatsusatootonoiMac ~ % curl -i -H "Authorization: token ghp_mytoken" \
    -d '{
        "name": "blog",
        "auto_init": true,
        "private": true,
        "gitignore_template": "Nanoc"
      }' \
    https://api.github.com/user/repos
HTTP/2 201 
server: GitHub.com
date: Sun, 06 Aug 2023 17:21:15 GMT
...
location: https://api.github.com/repos/MisatoMaesaka/blog
{
...
 "name": "blog",
...
  "private": true,
...
"html_url": "https://github.com/MisatoMaesaka/blog",
...
  "created_at": "2023-08-06T17:21:15Z",
  "updated_at": "2023-08-06T17:21:15Z",
...
  "visibility": "private",
...
```
- Postman結果
<img width="1481" alt="スクリーンショット 2023-08-07 10 25 56" src="https://github.com/MisatoMaesaka/github-handson/assets/139186715/7d1ba4f9-89e4-4119-9805-4da8fb8ddaf6">

### PACTHリクエスト

1. リポジトリ名をblogからhell-world-blogに変更する
1. privateをpublicに変更
1. Aboutを"This is your blog repository"に変更
1. ホームページに"https://github.com" を設定

- ターミナル curl 結果

```
 % curl -i -X PATCH \
  -H "Accept: application/vnd.github.v3+json" \
  -H "Authorization: token ghp_mytoken" \
  https://api.github.com/repos/MisatoMaesaka/blog \
  -d '{
    "name":"hello-world-blog",
    "description":"This is your blog repository",
    "homepage":"https://github.com",
    "private":false
  }'
HTTP/2 200 
server: GitHub.com
date: Mon, 07 Aug 2023 01:41:19 GMT
...
{
...
"name": "hello-world-blog",
...
  "private": false,
...
"html_url": "https://github.com/MisatoMaesaka/hello-world-blog",
  "description": "This is your blog repository",
...
  "created_at": "2023-08-06T17:21:15Z",
  "updated_at": "2023-08-07T01:41:18Z",
...
  "homepage": "https://github.com",
...
 "visibility": "public",
...
```
- Postman 結果
<img width="1489" alt="スクリーンショット 2023-08-07 11 21 09" src="https://github.com/MisatoMaesaka/github-handson/assets/139186715/f440730e-b183-4d9c-9f9b-e1e9cdc625a7">

### DELETEリクエスト
- ターミナル　curl 結果
```
maesakamisato@seimatsusatootonoiMac ~ % curl -i -X DELETE \                                             
  -H "Authorization: token ghp_mytoken" \
  https://api.github.com/repos/MisatoMaesaka/hello-world-blog
HTTP/2 204 
server: GitHub.com
date: Mon, 07 Aug 2023 02:49:43 GMT
...
```
- Postman 結果
<img width="1461" alt="スクリーンショット 2023-08-07 11 39 59" src="https://github.com/MisatoMaesaka/github-handson/assets/139186715/db1c7aeb-20a7-4b49-a0a5-36862190ea15">







