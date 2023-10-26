package com.dsa.misc;

public class Palindrome {
    //MOM--RADAR--ROTATOR
    public static void main(String[] args) {
        Palindrome solution = new Palindrome();
        String str = "\"civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth\"";
//        System.out.println("Longest Palindrome is ---> "+solution.longestPalindrome("babad"));
        String testCase2 = "busislnescsicxpvvysuqgcudefrfjbwwjcchtgqyajdfwvkypfwshnihjdztgmyuuljxgvhdiwphrweyfkbnjgerkmifbirubhseuhrugwrabnjafnbdfjnufdstjbkuwtnpflffaqmjbhssjlnqftgjiglvvequhapasarlkcvbmkwnkuvwktbgfoaxteprobdwswcdyddyvrehvmxrrjiiidatidlpihkbmmruysmhhsncmfdanafdrfpdtfgkglcqpwrrtvacuicohspkounojuziittugpqjyhhkwfnflozbispehrtrnizowrlzcuollagxwtznjwzcumvedjwokueuqktvvouwnsmpxqvvpuwprezrbobrpnwaccwljchdguubjulyilzvmandjjleitweybqkjttschrjjlebnmponvlktzzcdtuybugggcqffkcffpamauvxfbonjrobgpvlyzveiwemmtdvbjciaytvesnocnjrwodtcokgcuoiicxapmrzpkfphjniuvzjrhbnqndfshoduejyktebgdabidxlkstepuwvtrtgbxaeheylicvhrxddijshcvdadxzsccmainyfpfdhqdanfccqkzlmhsfilvoybqojlvbcixjzqpbngdvesuokbxhkomsiqfyukvspqthlzxdnlwthrgaxhtpjzhrugqbfokrdcyurivmzgtynoqfjbafboselxnfupnpqlryvlcxeksirvufepfwczosrrjpudbwqxwldgjyfjhzlzcojxyqjyxxiqvfhjdwtgoqbyeocffnyxhyyiqspnvrpxmrtcnviukrjvpavervvztoxajriuvxqveqsrttjqepvvahywuzwtmgyrzduxfqspeipimyoxmkadrvrdyefekjxcmsmzmtbugyckcbjsrymszftjyllfmoeoylzeahnrxlxpnlvlvzltwnmldi";
        String testCase3 = "fjnfkfbfeuujctmyttwidcrdjtkfoaylsceqqzzmkpyvljkwcxxtmxiwkrgoahxztuppnvxhyionhpakvjoizdzcqxuyaidjadrhfhuhbncijokbthvuigjytipgygnonhgkpvsqimxpslmptieumhunjlafttjstaxnivrpqcxrgocvaicpwfnmtkgbjnbfopxaiduqihomrdmhzzyzddytiqdjzmmqwmeyoqnttmiujobihdifkbntpphjhgxzbjpulnokvceohloltyosddbopgkllcxzzkfzmkywxlpkdjlorgorxzownuajjzcxuhyqexfklssbtralzlvdbtxapccipvvgjtusfsanvnyehpkwirygqogtsicwycgnajwekuzffhlsvfgqwpbuinwhvpqxjhamhxayicchmxmurakhzhoghnupohaqanduhjkegggpyetwebcjgavpspfjaoakjkktaxwehpyqvsczhbbhzcsvqyphewxatkkjkaoajfpspvagjcbewteypgggekjhudnaqahopunhgohzhkarumxmhcciyaxhmahjxqpvhwniubpwqgfvslhffzukewjangcywcistgoqgyriwkpheynvnasfsutjgvvpiccpaxtbdvlzlartbsslkfxeqyhuxczjjaunwozxrogroljdkplxwykmzfkzzxcllkgpobddsoytlolhoecvkonlupjbzxghjhpptnbkfidhibojuimttnqoyemwqmmzjdqityddzyzzhmdrmohiqudiaxpofbnjbgktmnfwpciavcogrxcqprvinxatsjttfaljnuhmueitpmlspxmiqsvpkghnongygpityjgiuvhtbkojicnbhuhfhrdajdiayuxqczdziojvkaphnoiyhxvnpputzxhaogrkwixmtxxcwkjlvypkmzzqqecslyaofktjdrcdiwttymtcjuuefbfkfnjf";
        String testCase4 = "tktneonoubkxgfhybavrfnetlxgtkelsoeeuznssntcleenqgiboexflfvlfiapqjbcwyenmfnmxcbcjscucqhwuqfzvvkdxrtxzhjdvsjawcwffoglhkxvyxaninlswyjcfvdwfkqheidwprtjaaqzqgloctafkuasubqqeacdpmtfzokccmnslnklxyvfitbfbdjrlzhkhnturfkimghcnngvdhbehewzzyfsbsactkrfabkhaavryubckkrqbqcbenqpeykyawzkctswaczbjtzeyteftsjklrtchxggsslscypkuilhbitsjwzsvwmqahxkmghigdtuqehjkqswchkrolcloxnkqocyjeorkwjmbevwijmqfhtmolspqcqshafjuxcheckguzxvapfivznkzdkzwnvlquzrbkhvmpdclrettjrxinbbvlwtsyepestvwjfiekjaqphfrhiifrplokslzaxmlwafrrfawlmxazlskolprfiihrfhpqajkeifjwvtsepeystwlvbbnixrjtterlcdpmvhkbrzuqlvnwzkdzknzvifpavxzugkcehcxujfahsqcqpslomthfqmjiwvebmjwkroejycoqknxolclorkhcwsqkjhequtdgihgmkxhaqmwvszwjstibhliukpycslssggxhctrlkjstfetyeztjbzcawstckzwaykyepqnebcqbqrkkcbuyrvaahkbafrktcasbsfyzzwehebhdvgnnchgmikfrutnhkhzlrjdbfbtifvyxlknlsnmcckozftmpdcaeqqbusaukfatcolgqzqaajtrpwdiehqkfwdvfcjywslninaxyvxkhlgoffwcwajsvdjhzxtrxdkvvzfquwhqcucsjcbcxmnfmneywcbjqpaiflvflfxeobigqneelctnssnzueeoslektgxltenfrvabyhfgxkbuonoentkt";
        String testCase5 = "yfikrcvmuegdciuqahlsjesplljlswxaejgdzhubzqkiroxyhtjvazcwcnsvdzjiainmiyobyfclyugttaswlntwukkfbebcdaxdpaxwqenkxxphxdcgrnpruoaetvunwyskswvvmjmltncsdukwzlpfodhgxkjvzppwpvmqlfbojgbdiryleskemhjfoxxzjqihcykpgzhaugwwbqtddjzpmrgdncgzsttqenmbnnavfjkiennwxtguywoaiuungqpyfcffzmljfianapawiayywuvazrnxouvndzqbmmyntkkdyykgodjbeojtpnsyhfrltuazgznddaaibupephvgrcjpzvjttmhtnydwvrpgijselaukwrcosxpcbptebalkheymuyblffahvbszotmutmmqhlgoskuoejvavlprvgyozpylsnqhqrnqpabgbwzwxyibpmsauxcfnbtwwbosksuzqzmobijytxxtyjibomzqzusksobwwtbnfcxuasmpbiyxwzwbgbapqnrqhqnslypzoygvrplvavjeouksoglhqmmtumtozsbvhafflbyumyehklabetpbcpxsocrwkualesjigprvwdynthmttjvzpjcrgvhpepubiaaddnzgzautlrfhysnptjoebjdogkyydkktnymmbqzdnvuoxnrzavuwyyaiwapanaifjlmzffcfypqgnuuiaowyugtxwnneikjfvannbmneqttszgcndgrmpzjddtqbwwguahzgpkychiqjzxxofjhmekselyridbgjobflqmvpwppzvjkxghdofplzwkudscntlmjmvvwsksywnuvteaourpnrgcdxhpxxkneqwxapdxadcbebfkkuwtnlwsattguylcfyboyimniaijzdvsncwczavjthyxorikqzbuhzdgjeaxwsljllpsejslhaquicdgeumvcrkify";
        String testCase6 = "abababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababa";
        System.out.println("Longest Palindrome is ---> "+solution.longestPalindrome(testCase6));//ranynar

    }
    public boolean isPalindrome( String str ){
        String tempStr = "";
        for( int i = str.length()-1; i >= 0; i--){
            tempStr += String.valueOf(str.charAt(i));
        }
        if(tempStr.equalsIgnoreCase(str)){
            return true;
        }else{
            return false;
        }
    }

    public String longestPalindrome(String s){

        String longestPalindrom = String.valueOf(s.charAt(0));
        String tempStr = "";
        if( s.length() < 2 ){
            return s;
        }
        if( s.length() < 3 ){
            if(s.charAt(0) == s.charAt(1)){
                return s;
            }
            return String.valueOf(s.charAt(0));
        }
        int counterFr = 0;
        int counterIf = 0;
        for(int i=0; i < s.length(); i++){
            System.out.println("countr for "+counterFr++);
            tempStr = String.valueOf(s.charAt(i));
            for(int j = i+1; j < s.length(); j++){
                tempStr += String.valueOf(s.charAt(j));

                if( String.valueOf(s.charAt(i)).equalsIgnoreCase(String.valueOf(s.charAt(j))) && String.valueOf(s.charAt(i+1)).equalsIgnoreCase(String.valueOf(s.charAt(j-1))) && String.valueOf(s.charAt(i+2)).equalsIgnoreCase(String.valueOf(s.charAt(j-2)))){
                    System.out.println("String.valueOf(s.charAt(i)) "+String.valueOf(s.charAt(i))+" i--> "+i);
                    System.out.println("String.valueOf(s.charAt(j)) "+String.valueOf(s.charAt(j))+" j--> "+j);
                    System.out.println("countr If "+counterIf++);

                    if( checkPalindrome(tempStr) ){//249000
//                        if( isPalindrome(tempStr) ){//249000

                        if(tempStr.length() > longestPalindrom.length()){
                            longestPalindrom = tempStr;
                        }
                    }
                }
            }
        }
        return longestPalindrom;
    }
    public static boolean checkPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

}

