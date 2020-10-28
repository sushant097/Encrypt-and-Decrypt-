
# Here this is the basic Encrypt and Decryption in java.
* ALL the main logic is that read the ASCII value of the each character of the string and shift (add) the ASCII value by the `key + extra value` and in decryption remove the extra value by the given `key + extra value ` to extract the original information.
* **In this project the interesting thing is that whole process is done without using the encrypt and decrypt in-built function of java. (all the code is used as self-logic).. Good to understand how encryption and decryption works also**
 
As, the function `String encryptcon(String mess,int code)` 
                 receives the mess as string type and the code as integer which is the key input by the user. 
So, inside it it encrypt every character by the enter key and the random number stored inside it such that 
* If the input message is **" Hello This is the Encrypt and Decrypt in java"** and the key is 1234 then, as Encrypted form is: 
`"ಯ㖡彳⡽඀ֳփٟڔ➂Ԕ⯌◟ಇ㖰彯⡶റט֝ٚڝ➈դ⯗▌ೈ㖪彫⠱ൕ׸֒٩ڤ❿ը⮃◕ೕ㕜影⡲ඇ7343432" `
 Here you see that the encrypt data is almost change compare to input. And last number you see here is the impure key added with external unknown number to extract the key to check while in decrypting the encrypted data.
* **The same concept is used as in decrypting the content as, subtracting the added extra number to it.**
Here is also jar file u can directly use it as an application.
if u have any suggestion of information then send me at sushant1234gautam@gmail.com
Thanks for seeing it.  Good Luck!!

#### Download: The ready use Application can be downloaded from [here](https://drive.google.com/file/d/1SVhK_XyWaVwv30qkJLFtGR_gG3zd9mXh/view?usp=sharing) as window application.
# Demo
------------------------------------------------------------------------------------
![](https://github.com/sushant097/Encrypt-and-Decrypt-/blob/master/Images/Must-See.png)
![](https://github.com/sushant097/Encrypt-and-Decrypt-/blob/master/Images/the-basic-shot.png)
![](https://github.com/sushant097/Encrypt-and-Decrypt-/blob/master/Images/ALLthEiNFORM.png)
![](https://github.com/sushant097/Encrypt-and-Decrypt-/blob/master/Images/Main-Window.png)
------------------------------------------------------------------------------------------

## Notes
To be honest, I didn't name it any, but everyone like the concept behind it. I will welcome any improvement over this project. 
When I compare the system time complexity and space complexity to other algorithms such as AES, DES, this algorithm has good performance compared to others.

## Improvement
* How to better encrypt the key seen at end of encrypted content.
* Add further encryption such as Image, Video etc.
* **Advanced Feature: Encrypt from the Internet (link) content, and able to email the encrypted content to the specific person.**


