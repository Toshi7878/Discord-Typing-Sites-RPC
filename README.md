# Discord-Typing-Sites-RPC
Discordにプレイ中のタイピングサイト・ソフトをリアルタイムで表示します

# 推奨環境
- Windows 10

- Google Chrome

- Tampermonkey Extension

- Java

# インストール方法
- 1: 使用しているブラウザに [Tampermonkey](https://chrome.google.com/webstore/detail/tampermonkey/dhdgffkkebhmkfjojejmpbldmpobfkfo) をインストールします。(インストール済みの方は次へ)

- 2: [Java](https://java.com/ja/download/) をインストールします。(インストール済みの方は次へ)

- 3: [Discord Typing Sites RPC.user.js](https://github.com/Toshi7878/Discord-Typing-Sites-RPC/raw/main/Discord%20Typing%20Sites%20RPC.user.js) をインストールします。

- 4: PC のエクスプローラーのアドレス欄に `shell:startup` と入力し表示されたフォルダ内に [Discord Typing Sites RPC1.1.exe](https://github.com/Toshi7878/Discord-Typing-Sites-RPC/raw/main/Discord%20Typing%20Sites%20RPC1.1.exe) をダウンロードしファイルをコピーします。



- 5:Discord Typing Sites RPC.exeを右クリック→プロパティを開き、[許可する]のチェックボックスを有効後、適用ボタンをクリックしてプロパティを閉じます。
<img src="https://dl.easyuploader.cloud/20210912151532_515a3736.png" height="30%" width="30%">
- 6: (初回のみ!!) 先程フォルダ内にコピーしたexeファイルをダブルクリックして起動します。(次の起動時から自動的に起動します。)<br><br>


※「このアプリはお使いのPCでは実行できません」等の表示がでてしまう方は[こちら](https://github.com/Toshi7878/Discord-Typing-Sites-RPC/blob/main/README.md#このアプリはお使いのPCでは実行できませんが出てしまう場合の導入方法)をお試しください。


# スクリーンショット
<img src="https://dl.easyuploader.cloud/20210912154738_4e496139.png" height="40%" width="40%">

<img src="https://dl.easyuploader.cloud/20210920030954_72556f41.png" height="40%" width="40%">

<img src="https://dl.easyuploader.cloud/20210912152954_6b515a79.png" height="40%" width="40%">


# PreMiD対応タイピングサイトについて

[Keymash](https://keyma.sh/)<br>
[KickAssFingers](https://kickassfingers.com/)<br>
[Monkeytype](https://monkeytype.com/)<br>
[Nitro Type](https://www.nitrotype.com/)<br>
[Typer.io](https://typer.io/)<br>
[Typeracer](https://play.typeracer.com/)<br>

以上6つのサイトは[PreMiD](https://premid.app)で対応されているのでDiscord-Typing-Sites-RPCでは非対応になります。<br>
PreMiD拡張機能を導入することで[PreMiD Store](https://premid.app/store)からRich Presenceデータをインストールできます。(PreMiD Store検索で[typing]と検索すると出てきます。)


# アンインストール方法
- 1: Shift+Ctrl+Escキーを押してタスクマネージャーを起動します。

- 2: プロセス一覧にある「Java(TM) Platform SE binary」(javaw.exe)を終了させます。
<img src="https://dl.easyuploader.cloud/20210912151626_376d3166.png" height="40%" width="40%">

- 3: PC のエクスプローラーのアドレス欄に `shell:startup` と入力しフォルダ内の Discord Typing Sites RPC.exe を削除します。

- 4: ブラウザのTampermonkeyメニューを開き、Discord Typing Sites RPCの[>]マークをクリックすると削除が出てくるので、削除をクリックしてDiscord Typing Sites RPC.user.jsを削除します。
<img src="https://dl.easyuploader.cloud/20210912151919_796b564f.png" height="30%" width="30%">




# このアプリはお使いのPCでは実行できませんが出てしまう場合の導入方法
<img src="https://dl.easyuploader.cloud/20210925213602_4c6b7558.png" height="40%" width="40%">

Discord Typing Sites RPC.exe実行時に上の画像の表示が出てしまう場合は以下のjarファイルから実行する導入方法を試してみてください。<br>
先程DLしたDiscord Typing Sites RPC1.1.exeは使用しないので削除して頂いて大丈夫です。


- 1: [Discord Typing Sites RPC Jar ver1.1.zip](https://github.com/Toshi7878/Discord-Typing-Sites-RPC/raw/main/Discord%20Typing%20Sites%20RPC%20Jar%20ver1.1.zip)をダウンロードします。<br>

- 2: 解凍して出てきたDiscord Typing Sites RPC Jarフォルダを任意のフォルダに配置します。(例: タイピングツール置き場 や C:\Program Filesフォルダ等の好きなフォルダに配置)

- 3: Discord-Typing-Sites-RPC.vbsファイルを右クリック＞ショートカットの作成(S)で[Discord-Typing-Sites-RPC - ショートカット]ファイルを作成します。

- 4: PC のエクスプローラーのアドレス欄に `shell:startup` と入力し表示されたフォルダ内に [Discord-Typing-Sites-RPC - ショートカット] を移動します。

- 5: (初回のみ!!) 先程フォルダ内に移動した ショートカットファイルをダブルクリックして起動 または PCの再起動 をします。(次の起動時から自動的に起動します。)

(注)vbsファイルからjarファイルを実行するため、[Discord-Typing-Sites-RPC.jar]ファイル名を変更すると起動しなくなります。

