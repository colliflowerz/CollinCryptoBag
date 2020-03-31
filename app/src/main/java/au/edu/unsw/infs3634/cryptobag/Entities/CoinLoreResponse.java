
package au.edu.unsw.infs3634.cryptobag.Entities;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CoinLoreResponse {

    @SerializedName("data")
    @Expose
    private List<Coin> data = null;
    @SerializedName("info")
    @Expose
    private Info info;

    public List<Coin> getData() {
        return data;
    }

    public void setData(List<Coin> data) {
        this.data = data;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public static String json = "{\n" +
            "  \"data\": [\n" +
            "    {\n" +
            "      \"id\": \"90\",\n" +
            "      \"symbol\": \"BTC\",\n" +
            "      \"name\": \"Bitcoin\",\n" +
            "      \"nameid\": \"bitcoin\",\n" +
            "      \"rank\": 1,\n" +
            "      \"price_usd\": \"6377.65\",\n" +
            "      \"percent_change_24h\": \"0.24\",\n" +
            "      \"percent_change_1h\": \"-0.66\",\n" +
            "      \"percent_change_7d\": \"-0.94\",\n" +
            "      \"price_btc\": \"1.00\",\n" +
            "      \"market_cap_usd\": \"116590872086.78\",\n" +
            "      \"volume24\": 27289289050.70079,\n" +
            "      \"volume24a\": 25784141555.92755,\n" +
            "      \"csupply\": \"18281159.00\",\n" +
            "      \"tsupply\": \"18281159\",\n" +
            "      \"msupply\": \"21000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"80\",\n" +
            "      \"symbol\": \"ETH\",\n" +
            "      \"name\": \"Ethereum\",\n" +
            "      \"nameid\": \"ethereum\",\n" +
            "      \"rank\": 2,\n" +
            "      \"price_usd\": \"131.72\",\n" +
            "      \"percent_change_24h\": \"-1.17\",\n" +
            "      \"percent_change_1h\": \"-0.43\",\n" +
            "      \"percent_change_7d\": \"-1.76\",\n" +
            "      \"price_btc\": \"0.020616\",\n" +
            "      \"market_cap_usd\": \"14515005857.12\",\n" +
            "      \"volume24\": 9361735066.121084,\n" +
            "      \"volume24a\": 9221939601.038265,\n" +
            "      \"csupply\": \"110196485.00\",\n" +
            "      \"tsupply\": \"110196485\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"58\",\n" +
            "      \"symbol\": \"XRP\",\n" +
            "      \"name\": \"XRP\",\n" +
            "      \"nameid\": \"ripple\",\n" +
            "      \"rank\": 3,\n" +
            "      \"price_usd\": \"0.171928\",\n" +
            "      \"percent_change_24h\": \"-1.31\",\n" +
            "      \"percent_change_1h\": \"0.06\",\n" +
            "      \"percent_change_7d\": \"8.84\",\n" +
            "      \"price_btc\": \"0.000027\",\n" +
            "      \"market_cap_usd\": \"7377338958.64\",\n" +
            "      \"volume24\": 1497497373.1928835,\n" +
            "      \"volume24a\": 1701466493.5083325,\n" +
            "      \"csupply\": \"42909539227.00\",\n" +
            "      \"tsupply\": \"99991841593\",\n" +
            "      \"msupply\": \"100000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"518\",\n" +
            "      \"symbol\": \"USDT\",\n" +
            "      \"name\": \"Tether\",\n" +
            "      \"nameid\": \"tether\",\n" +
            "      \"rank\": 4,\n" +
            "      \"price_usd\": \"1.00\",\n" +
            "      \"percent_change_24h\": \"-0.42\",\n" +
            "      \"percent_change_1h\": \"0.01\",\n" +
            "      \"percent_change_7d\": \"0.02\",\n" +
            "      \"price_btc\": \"0.000157\",\n" +
            "      \"market_cap_usd\": \"4065040953.24\",\n" +
            "      \"volume24\": 33425632077.84043,\n" +
            "      \"volume24a\": 31108483831.28356,\n" +
            "      \"csupply\": \"4049107372.00\",\n" +
            "      \"tsupply\": \"4049107372\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2321\",\n" +
            "      \"symbol\": \"BCH\",\n" +
            "      \"name\": \"Bitcoin Cash\",\n" +
            "      \"nameid\": \"bitcoin-cash\",\n" +
            "      \"rank\": 5,\n" +
            "      \"price_usd\": \"218.63\",\n" +
            "      \"percent_change_24h\": \"0.22\",\n" +
            "      \"percent_change_1h\": \"-0.40\",\n" +
            "      \"percent_change_7d\": \"-0.30\",\n" +
            "      \"price_btc\": \"0.034217\",\n" +
            "      \"market_cap_usd\": \"4010441684.31\",\n" +
            "      \"volume24\": 2183472160.8948097,\n" +
            "      \"volume24a\": 2048775151.8790526,\n" +
            "      \"csupply\": \"18343840.00\",\n" +
            "      \"tsupply\": \"18343840\",\n" +
            "      \"msupply\": \"21000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33234\",\n" +
            "      \"symbol\": \"BCHSV\",\n" +
            "      \"name\": \"Bitcoin SV\",\n" +
            "      \"nameid\": \"bitcoin-cash-sv\",\n" +
            "      \"rank\": 6,\n" +
            "      \"price_usd\": \"164.52\",\n" +
            "      \"percent_change_24h\": \"3.07\",\n" +
            "      \"percent_change_1h\": \"-0.18\",\n" +
            "      \"percent_change_7d\": \"-2.34\",\n" +
            "      \"price_btc\": \"0.025749\",\n" +
            "      \"market_cap_usd\": \"3017528410.20\",\n" +
            "      \"volume24\": 1830939142.0484996,\n" +
            "      \"volume24a\": 1193610790.2813196,\n" +
            "      \"csupply\": \"18341277.00\",\n" +
            "      \"tsupply\": \"21000000\",\n" +
            "      \"msupply\": \"21000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"1\",\n" +
            "      \"symbol\": \"LTC\",\n" +
            "      \"name\": \"Litecoin\",\n" +
            "      \"nameid\": \"litecoin\",\n" +
            "      \"rank\": 7,\n" +
            "      \"price_usd\": \"38.75\",\n" +
            "      \"percent_change_24h\": \"-1.11\",\n" +
            "      \"percent_change_1h\": \"-0.22\",\n" +
            "      \"percent_change_7d\": \"-0.16\",\n" +
            "      \"price_btc\": \"0.006065\",\n" +
            "      \"market_cap_usd\": \"2503952645.13\",\n" +
            "      \"volume24\": 2964043779.120713,\n" +
            "      \"volume24a\": 2312478727.6943674,\n" +
            "      \"csupply\": \"64619858.00\",\n" +
            "      \"tsupply\": \"64619858\",\n" +
            "      \"msupply\": \"84000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2679\",\n" +
            "      \"symbol\": \"EOS\",\n" +
            "      \"name\": \"EOS\",\n" +
            "      \"nameid\": \"eos\",\n" +
            "      \"rank\": 8,\n" +
            "      \"price_usd\": \"2.20\",\n" +
            "      \"percent_change_24h\": \"-1.40\",\n" +
            "      \"percent_change_1h\": \"-0.40\",\n" +
            "      \"percent_change_7d\": \"-3.40\",\n" +
            "      \"price_btc\": \"0.000344\",\n" +
            "      \"market_cap_usd\": \"2041699502.73\",\n" +
            "      \"volume24\": 2122136516.0197663,\n" +
            "      \"volume24a\": 1990703975.5632899,\n" +
            "      \"csupply\": \"929000281.00\",\n" +
            "      \"tsupply\": \"1006245120\",\n" +
            "      \"msupply\": \"1006245120\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2710\",\n" +
            "      \"symbol\": \"BNB\",\n" +
            "      \"name\": \"Binance Coin\",\n" +
            "      \"nameid\": \"binance-coin\",\n" +
            "      \"rank\": 9,\n" +
            "      \"price_usd\": \"12.43\",\n" +
            "      \"percent_change_24h\": \"1.86\",\n" +
            "      \"percent_change_1h\": \"-0.92\",\n" +
            "      \"percent_change_7d\": \"2.78\",\n" +
            "      \"price_btc\": \"0.001945\",\n" +
            "      \"market_cap_usd\": \"1933356986.70\",\n" +
            "      \"volume24\": 272949742.70384413,\n" +
            "      \"volume24a\": 196274608.40608427,\n" +
            "      \"csupply\": \"155536713.00\",\n" +
            "      \"tsupply\": \"192443301\",\n" +
            "      \"msupply\": \"200000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33833\",\n" +
            "      \"symbol\": \"LEO\",\n" +
            "      \"name\": \"UNUS SED LEO\",\n" +
            "      \"nameid\": \"unus-sed-leo\",\n" +
            "      \"rank\": 10,\n" +
            "      \"price_usd\": \"1.04\",\n" +
            "      \"percent_change_24h\": \"2.44\",\n" +
            "      \"percent_change_1h\": \"0.56\",\n" +
            "      \"percent_change_7d\": \"2.03\",\n" +
            "      \"price_btc\": \"0.000163\",\n" +
            "      \"market_cap_usd\": \"1041292051.58\",\n" +
            "      \"volume24\": 2024138.0902993493,\n" +
            "      \"volume24a\": 1628755.659693162,\n" +
            "      \"csupply\": \"999498893.00\",\n" +
            "      \"tsupply\": \"999498893\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"3682\",\n" +
            "      \"symbol\": \"XTZ\",\n" +
            "      \"name\": \"Tezos\",\n" +
            "      \"nameid\": \"tezos\",\n" +
            "      \"rank\": 11,\n" +
            "      \"price_usd\": \"1.57\",\n" +
            "      \"percent_change_24h\": \"-1.91\",\n" +
            "      \"percent_change_1h\": \"-1.23\",\n" +
            "      \"percent_change_7d\": \"-5.73\",\n" +
            "      \"price_btc\": \"0.000246\",\n" +
            "      \"market_cap_usd\": \"1039111250.76\",\n" +
            "      \"volume24\": 69634236.84957965,\n" +
            "      \"volume24a\": 68543217.94394408,\n" +
            "      \"csupply\": \"660373612.00\",\n" +
            "      \"tsupply\": \"763306930\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"89\",\n" +
            "      \"symbol\": \"XLM\",\n" +
            "      \"name\": \"Stellar\",\n" +
            "      \"nameid\": \"stellar\",\n" +
            "      \"rank\": 12,\n" +
            "      \"price_usd\": \"0.040227\",\n" +
            "      \"percent_change_24h\": \"-0.52\",\n" +
            "      \"percent_change_1h\": \"-0.20\",\n" +
            "      \"percent_change_7d\": \"2.58\",\n" +
            "      \"price_btc\": \"0.000006\",\n" +
            "      \"market_cap_usd\": \"815946158.91\",\n" +
            "      \"volume24\": 272441431.89088374,\n" +
            "      \"volume24a\": 256190067.59831032,\n" +
            "      \"csupply\": \"20283516588.00\",\n" +
            "      \"tsupply\": \"104303927518\",\n" +
            "      \"msupply\": \"104303927518\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"28\",\n" +
            "      \"symbol\": \"XMR\",\n" +
            "      \"name\": \"Monero\",\n" +
            "      \"nameid\": \"monero\",\n" +
            "      \"rank\": 13,\n" +
            "      \"price_usd\": \"46.80\",\n" +
            "      \"percent_change_24h\": \"-0.35\",\n" +
            "      \"percent_change_1h\": \"-0.73\",\n" +
            "      \"percent_change_7d\": \"7.01\",\n" +
            "      \"price_btc\": \"0.007326\",\n" +
            "      \"market_cap_usd\": \"803842818.41\",\n" +
            "      \"volume24\": 120173132.47401883,\n" +
            "      \"volume24a\": 116470069.8027445,\n" +
            "      \"csupply\": \"17174299.00\",\n" +
            "      \"tsupply\": \"17174299\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"257\",\n" +
            "      \"symbol\": \"ADA\",\n" +
            "      \"name\": \"Cardano\",\n" +
            "      \"nameid\": \"cardano\",\n" +
            "      \"rank\": 14,\n" +
            "      \"price_usd\": \"0.029885\",\n" +
            "      \"percent_change_24h\": \"0.66\",\n" +
            "      \"percent_change_1h\": \"-0.30\",\n" +
            "      \"percent_change_7d\": \"2.76\",\n" +
            "      \"price_btc\": \"0.000005\",\n" +
            "      \"market_cap_usd\": \"774827461.77\",\n" +
            "      \"volume24\": 68839412.85042234,\n" +
            "      \"volume24a\": 67413602.0901705,\n" +
            "      \"csupply\": \"25927070538.00\",\n" +
            "      \"tsupply\": \"31112483745\",\n" +
            "      \"msupply\": \"45000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2713\",\n" +
            "      \"symbol\": \"TRX\",\n" +
            "      \"name\": \"TRON\",\n" +
            "      \"nameid\": \"tron\",\n" +
            "      \"rank\": 15,\n" +
            "      \"price_usd\": \"0.011494\",\n" +
            "      \"percent_change_24h\": \"0.83\",\n" +
            "      \"percent_change_1h\": \"0.34\",\n" +
            "      \"percent_change_7d\": \"1.74\",\n" +
            "      \"price_btc\": \"0.000002\",\n" +
            "      \"market_cap_usd\": \"766449890.46\",\n" +
            "      \"volume24\": 552862265.4247696,\n" +
            "      \"volume24a\": 752630833.3288839,\n" +
            "      \"csupply\": \"66682072191.00\",\n" +
            "      \"tsupply\": \"99000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2751\",\n" +
            "      \"symbol\": \"LINK\",\n" +
            "      \"name\": \"ChainLink\",\n" +
            "      \"nameid\": \"chainlink\",\n" +
            "      \"rank\": 16,\n" +
            "      \"price_usd\": \"2.13\",\n" +
            "      \"percent_change_24h\": \"-0.98\",\n" +
            "      \"percent_change_1h\": \"-0.58\",\n" +
            "      \"percent_change_7d\": \"-4.65\",\n" +
            "      \"price_btc\": \"0.000333\",\n" +
            "      \"market_cap_usd\": \"745469549.65\",\n" +
            "      \"volume24\": 172179600.71230674,\n" +
            "      \"volume24a\": 173420312.68370488,\n" +
            "      \"csupply\": \"350000000.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"1000000000 \"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"8\",\n" +
            "      \"symbol\": \"DASH\",\n" +
            "      \"name\": \"Dash\",\n" +
            "      \"nameid\": \"dash\",\n" +
            "      \"rank\": 17,\n" +
            "      \"price_usd\": \"64.82\",\n" +
            "      \"percent_change_24h\": \"-0.22\",\n" +
            "      \"percent_change_1h\": \"-0.77\",\n" +
            "      \"percent_change_7d\": \"-7.49\",\n" +
            "      \"price_btc\": \"0.010145\",\n" +
            "      \"market_cap_usd\": \"608871289.14\",\n" +
            "      \"volume24\": 467567544.5917805,\n" +
            "      \"volume24a\": 492805776.5864484,\n" +
            "      \"csupply\": \"9393253.00\",\n" +
            "      \"tsupply\": \"9393253\",\n" +
            "      \"msupply\": \"18900000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"118\",\n" +
            "      \"symbol\": \"ETC\",\n" +
            "      \"name\": \"Ethereum Classic\",\n" +
            "      \"nameid\": \"ethereum-classic\",\n" +
            "      \"rank\": 18,\n" +
            "      \"price_usd\": \"4.90\",\n" +
            "      \"percent_change_24h\": \"-1.28\",\n" +
            "      \"percent_change_1h\": \"-0.66\",\n" +
            "      \"percent_change_7d\": \"-0.04\",\n" +
            "      \"price_btc\": \"0.000766\",\n" +
            "      \"market_cap_usd\": \"553212705.42\",\n" +
            "      \"volume24\": 1419765878.5448065,\n" +
            "      \"volume24a\": 1548691240.8309944,\n" +
            "      \"csupply\": \"112980348.00\",\n" +
            "      \"tsupply\": \"112980348\",\n" +
            "      \"msupply\": \"210000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33538\",\n" +
            "      \"symbol\": \"MIN\",\n" +
            "      \"name\": \"MINDOL\",\n" +
            "      \"nameid\": \"mindol\",\n" +
            "      \"rank\": 19,\n" +
            "      \"price_usd\": \"3.34\",\n" +
            "      \"percent_change_24h\": \"19.77\",\n" +
            "      \"percent_change_1h\": \"7.64\",\n" +
            "      \"percent_change_7d\": \"13.68\",\n" +
            "      \"price_btc\": \"0.000522\",\n" +
            "      \"market_cap_usd\": \"518332587.33\",\n" +
            "      \"volume24\": 762076.5069228259,\n" +
            "      \"volume24a\": 829065.0007176786,\n" +
            "      \"csupply\": \"155379617.00\",\n" +
            "      \"tsupply\": \"240000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33608\",\n" +
            "      \"symbol\": \"HEDG\",\n" +
            "      \"name\": \"HedgeTrade\",\n" +
            "      \"nameid\": \"hedgetrade\",\n" +
            "      \"rank\": 20,\n" +
            "      \"price_usd\": \"1.61\",\n" +
            "      \"percent_change_24h\": \"-1.73\",\n" +
            "      \"percent_change_1h\": \"-0.45\",\n" +
            "      \"percent_change_7d\": \"-1.90\",\n" +
            "      \"price_btc\": \"0.000253\",\n" +
            "      \"market_cap_usd\": \"465335403.65\",\n" +
            "      \"volume24\": 454765.0853249808,\n" +
            "      \"volume24a\": 387054.33800881525,\n" +
            "      \"csupply\": \"288393355.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"133\",\n" +
            "      \"symbol\": \"NEO\",\n" +
            "      \"name\": \"Neo\",\n" +
            "      \"nameid\": \"neo\",\n" +
            "      \"rank\": 21,\n" +
            "      \"price_usd\": \"6.55\",\n" +
            "      \"percent_change_24h\": \"-0.21\",\n" +
            "      \"percent_change_1h\": \"-0.76\",\n" +
            "      \"percent_change_7d\": \"-0.40\",\n" +
            "      \"price_btc\": \"0.001025\",\n" +
            "      \"market_cap_usd\": \"461753999.81\",\n" +
            "      \"volume24\": 397946074.2558182,\n" +
            "      \"volume24a\": 374042141.4598425,\n" +
            "      \"csupply\": \"70538831.00\",\n" +
            "      \"tsupply\": \"100000000\",\n" +
            "      \"msupply\": \"100000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33285\",\n" +
            "      \"symbol\": \"USDC\",\n" +
            "      \"name\": \"USD Coin\",\n" +
            "      \"nameid\": \"usd-coin\",\n" +
            "      \"rank\": 22,\n" +
            "      \"price_usd\": \"0.998997\",\n" +
            "      \"percent_change_24h\": \"0.13\",\n" +
            "      \"percent_change_1h\": \"-0.02\",\n" +
            "      \"percent_change_7d\": \"0.13\",\n" +
            "      \"price_btc\": \"0.000156\",\n" +
            "      \"market_cap_usd\": \"434595928.23\",\n" +
            "      \"volume24\": 215282789.7077027,\n" +
            "      \"volume24a\": 217949449.6671408,\n" +
            "      \"csupply\": \"435032301.00\",\n" +
            "      \"tsupply\": \"435032301\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33819\",\n" +
            "      \"symbol\": \"CRO\",\n" +
            "      \"name\": \"Crypto.com Chain\",\n" +
            "      \"nameid\": \"crypto-com-chain\",\n" +
            "      \"rank\": 23,\n" +
            "      \"price_usd\": \"0.042857\",\n" +
            "      \"percent_change_24h\": \"-1.23\",\n" +
            "      \"percent_change_1h\": \"-0.29\",\n" +
            "      \"percent_change_7d\": \"5.70\",\n" +
            "      \"price_btc\": \"0.000007\",\n" +
            "      \"market_cap_usd\": \"397747929.90\",\n" +
            "      \"volume24\": 4821233.781473898,\n" +
            "      \"volume24a\": 5084973.21389003,\n" +
            "      \"csupply\": \"9280821918.00\",\n" +
            "      \"tsupply\": \"100000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"447\",\n" +
            "      \"symbol\": \"IOTA\",\n" +
            "      \"name\": \"IOTA\",\n" +
            "      \"nameid\": \"iota\",\n" +
            "      \"rank\": 24,\n" +
            "      \"price_usd\": \"0.141092\",\n" +
            "      \"percent_change_24h\": \"0.51\",\n" +
            "      \"percent_change_1h\": \"-0.51\",\n" +
            "      \"percent_change_7d\": \"-1.24\",\n" +
            "      \"price_btc\": \"0.000022\",\n" +
            "      \"market_cap_usd\": \"392168158.98\",\n" +
            "      \"volume24\": 11876610.752491824,\n" +
            "      \"volume24a\": 10410128.48900125,\n" +
            "      \"csupply\": \"2779530283.00\",\n" +
            "      \"tsupply\": \"2779530283\",\n" +
            "      \"msupply\": \"2779530283\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33830\",\n" +
            "      \"symbol\": \"ATOM\",\n" +
            "      \"name\": \"Cosmos\",\n" +
            "      \"nameid\": \"cosmos\",\n" +
            "      \"rank\": 25,\n" +
            "      \"price_usd\": \"1.94\",\n" +
            "      \"percent_change_24h\": \"-2.79\",\n" +
            "      \"percent_change_1h\": \"-0.40\",\n" +
            "      \"percent_change_7d\": \"-7.21\",\n" +
            "      \"price_btc\": \"0.000304\",\n" +
            "      \"market_cap_usd\": \"370857713.86\",\n" +
            "      \"volume24\": 97221255.27051498,\n" +
            "      \"volume24a\": 103024257.59320629,\n" +
            "      \"csupply\": \"190688439.00\",\n" +
            "      \"tsupply\": \"237928231\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"70\",\n" +
            "      \"symbol\": \"NEM\",\n" +
            "      \"name\": \"NEM\",\n" +
            "      \"nameid\": \"nem\",\n" +
            "      \"rank\": 26,\n" +
            "      \"price_usd\": \"0.035891\",\n" +
            "      \"percent_change_24h\": \"-4.56\",\n" +
            "      \"percent_change_1h\": \"-1.99\",\n" +
            "      \"percent_change_7d\": \"-8.63\",\n" +
            "      \"price_btc\": \"0.000006\",\n" +
            "      \"market_cap_usd\": \"323021133.42\",\n" +
            "      \"volume24\": 26525108.664147068,\n" +
            "      \"volume24a\": 18035282.422385626,\n" +
            "      \"csupply\": \"8999999999.00\",\n" +
            "      \"tsupply\": \"8999999999\",\n" +
            "      \"msupply\": \"8999999999\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"12377\",\n" +
            "      \"symbol\": \"MKR\",\n" +
            "      \"name\": \"Maker\",\n" +
            "      \"nameid\": \"maker\",\n" +
            "      \"rank\": 27,\n" +
            "      \"price_usd\": \"294.85\",\n" +
            "      \"percent_change_24h\": \"-6.45\",\n" +
            "      \"percent_change_1h\": \"1.05\",\n" +
            "      \"percent_change_7d\": \"10.05\",\n" +
            "      \"price_btc\": \"0.046147\",\n" +
            "      \"market_cap_usd\": \"294846942.84\",\n" +
            "      \"volume24\": 3921251.4222989343,\n" +
            "      \"volume24a\": 4312798.361255118,\n" +
            "      \"csupply\": \"1000000.00\",\n" +
            "      \"tsupply\": \"1000000\",\n" +
            "      \"msupply\": \"1000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"134\",\n" +
            "      \"symbol\": \"ZEC\",\n" +
            "      \"name\": \"Zcash\",\n" +
            "      \"nameid\": \"zcash\",\n" +
            "      \"rank\": 28,\n" +
            "      \"price_usd\": \"30.41\",\n" +
            "      \"percent_change_24h\": \"0.29\",\n" +
            "      \"percent_change_1h\": \"-0.34\",\n" +
            "      \"percent_change_7d\": \"-4.20\",\n" +
            "      \"price_btc\": \"0.004759\",\n" +
            "      \"market_cap_usd\": \"288784579.54\",\n" +
            "      \"volume24\": 339082634.23976463,\n" +
            "      \"volume24a\": 294017594.7031389,\n" +
            "      \"csupply\": \"9496456.00\",\n" +
            "      \"tsupply\": \"9496456\",\n" +
            "      \"msupply\": \"21000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33061\",\n" +
            "      \"symbol\": \"INB\",\n" +
            "      \"name\": \"Insight Chain\",\n" +
            "      \"nameid\": \"insight-chain\",\n" +
            "      \"rank\": 29,\n" +
            "      \"price_usd\": \"0.774500\",\n" +
            "      \"percent_change_24h\": \"6.52\",\n" +
            "      \"percent_change_1h\": \"0.06\",\n" +
            "      \"percent_change_7d\": \"0.53\",\n" +
            "      \"price_btc\": \"0.000121\",\n" +
            "      \"market_cap_usd\": \"270999632.63\",\n" +
            "      \"volume24\": 20240542.714764986,\n" +
            "      \"volume24a\": 12735843.094902974,\n" +
            "      \"csupply\": \"349902689.00\",\n" +
            "      \"tsupply\": \"10000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2\",\n" +
            "      \"symbol\": \"DOGE\",\n" +
            "      \"name\": \"Dogecoin\",\n" +
            "      \"nameid\": \"dogecoin\",\n" +
            "      \"rank\": 30,\n" +
            "      \"price_usd\": \"0.001815\",\n" +
            "      \"percent_change_24h\": \"0.40\",\n" +
            "      \"percent_change_1h\": \"-0.24\",\n" +
            "      \"percent_change_7d\": \"0.02\",\n" +
            "      \"price_btc\": \"2.84E-7\",\n" +
            "      \"market_cap_usd\": \"224548164.54\",\n" +
            "      \"volume24\": 123779575.54234429,\n" +
            "      \"volume24a\": 127432000.73018005,\n" +
            "      \"csupply\": \"123727126384.00\",\n" +
            "      \"tsupply\": \"123727126384\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32479\",\n" +
            "      \"symbol\": \"TUSD\",\n" +
            "      \"name\": \"TrueUSD\",\n" +
            "      \"nameid\": \"trueusd\",\n" +
            "      \"rank\": 31,\n" +
            "      \"price_usd\": \"0.996196\",\n" +
            "      \"percent_change_24h\": \"-0.20\",\n" +
            "      \"percent_change_1h\": \"-0.16\",\n" +
            "      \"percent_change_7d\": \"-0.06\",\n" +
            "      \"price_btc\": \"0.000156\",\n" +
            "      \"market_cap_usd\": \"194739633.82\",\n" +
            "      \"volume24\": 374426176.0012724,\n" +
            "      \"volume24a\": 396779843.6227583,\n" +
            "      \"csupply\": \"195483256.00\",\n" +
            "      \"tsupply\": \"195483256\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32331\",\n" +
            "      \"symbol\": \"ONT\",\n" +
            "      \"name\": \"Ontology\",\n" +
            "      \"nameid\": \"ontology\",\n" +
            "      \"rank\": 32,\n" +
            "      \"price_usd\": \"0.363795\",\n" +
            "      \"percent_change_24h\": \"-1.40\",\n" +
            "      \"percent_change_1h\": \"-0.46\",\n" +
            "      \"percent_change_7d\": \"-1.97\",\n" +
            "      \"price_btc\": \"0.000057\",\n" +
            "      \"market_cap_usd\": \"194078468.75\",\n" +
            "      \"volume24\": 42018991.504259504,\n" +
            "      \"volume24a\": 44073690.91046894,\n" +
            "      \"csupply\": \"533483170.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33820\",\n" +
            "      \"symbol\": \"PAX\",\n" +
            "      \"name\": \"Paxos Standard Token\",\n" +
            "      \"nameid\": \"paxos-standard-token\",\n" +
            "      \"rank\": 33,\n" +
            "      \"price_usd\": \"0.997909\",\n" +
            "      \"percent_change_24h\": \"-0.05\",\n" +
            "      \"percent_change_1h\": \"-0.05\",\n" +
            "      \"percent_change_7d\": \"0.12\",\n" +
            "      \"price_btc\": \"0.000156\",\n" +
            "      \"market_cap_usd\": \"193960586.09\",\n" +
            "      \"volume24\": 405466036.28298616,\n" +
            "      \"volume24a\": 609131119.8748327,\n" +
            "      \"csupply\": \"194366961.00\",\n" +
            "      \"tsupply\": \"194366961\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"184\",\n" +
            "      \"symbol\": \"BAT\",\n" +
            "      \"name\": \"Basic Attention Token\",\n" +
            "      \"nameid\": \"basic-attention-token\",\n" +
            "      \"rank\": 34,\n" +
            "      \"price_usd\": \"0.138598\",\n" +
            "      \"percent_change_24h\": \"-0.97\",\n" +
            "      \"percent_change_1h\": \"-0.36\",\n" +
            "      \"percent_change_7d\": \"3.58\",\n" +
            "      \"price_btc\": \"0.000022\",\n" +
            "      \"market_cap_usd\": \"177297859.34\",\n" +
            "      \"volume24\": 55509448.617828935,\n" +
            "      \"volume24a\": 56835067.690351956,\n" +
            "      \"csupply\": \"1279225522.00\",\n" +
            "      \"tsupply\": \"1500000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2741\",\n" +
            "      \"symbol\": \"VET\",\n" +
            "      \"name\": \"VeChain\",\n" +
            "      \"nameid\": \"vechain\",\n" +
            "      \"rank\": 35,\n" +
            "      \"price_usd\": \"0.002962\",\n" +
            "      \"percent_change_24h\": \"-1.75\",\n" +
            "      \"percent_change_1h\": \"-1.04\",\n" +
            "      \"percent_change_7d\": \"3.85\",\n" +
            "      \"price_btc\": \"4.64E-7\",\n" +
            "      \"market_cap_usd\": \"164234418.13\",\n" +
            "      \"volume24\": 81336044.94326815,\n" +
            "      \"volume24a\": 77366410.86363919,\n" +
            "      \"csupply\": \"55454734800.00\",\n" +
            "      \"tsupply\": \"86712634466\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32351\",\n" +
            "      \"symbol\": \"HT\",\n" +
            "      \"name\": \"Huobi Token\",\n" +
            "      \"nameid\": \"huobi-token\",\n" +
            "      \"rank\": 36,\n" +
            "      \"price_usd\": \"3.27\",\n" +
            "      \"percent_change_24h\": \"0.86\",\n" +
            "      \"percent_change_1h\": \"-0.28\",\n" +
            "      \"percent_change_7d\": \"-1.77\",\n" +
            "      \"price_btc\": \"0.000512\",\n" +
            "      \"market_cap_usd\": \"163545076.33\",\n" +
            "      \"volume24\": 98812828.44849147,\n" +
            "      \"volume24a\": 138165180.83734056,\n" +
            "      \"csupply\": \"50000200.00\",\n" +
            "      \"tsupply\": \"500000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"99\",\n" +
            "      \"symbol\": \"DCR\",\n" +
            "      \"name\": \"Decred\",\n" +
            "      \"nameid\": \"decred\",\n" +
            "      \"rank\": 37,\n" +
            "      \"price_usd\": \"11.26\",\n" +
            "      \"percent_change_24h\": \"2.45\",\n" +
            "      \"percent_change_1h\": \"-0.35\",\n" +
            "      \"percent_change_7d\": \"-3.10\",\n" +
            "      \"price_btc\": \"0.001762\",\n" +
            "      \"market_cap_usd\": \"126743425.27\",\n" +
            "      \"volume24\": 79555282.03351043,\n" +
            "      \"volume24a\": 61451693.87652508,\n" +
            "      \"csupply\": \"11255663.00\",\n" +
            "      \"tsupply\": \"11255663\",\n" +
            "      \"msupply\": \"21000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"285\",\n" +
            "      \"symbol\": \"BTG\",\n" +
            "      \"name\": \"Bitcoin Gold\",\n" +
            "      \"nameid\": \"bitcoingold\",\n" +
            "      \"rank\": 38,\n" +
            "      \"price_usd\": \"7.12\",\n" +
            "      \"percent_change_24h\": \"-0.72\",\n" +
            "      \"percent_change_1h\": \"-0.50\",\n" +
            "      \"percent_change_7d\": \"-4.92\",\n" +
            "      \"price_btc\": \"0.001114\",\n" +
            "      \"market_cap_usd\": \"122791961.47\",\n" +
            "      \"volume24\": 17387070.19173072,\n" +
            "      \"volume24a\": 16736301.15815498,\n" +
            "      \"csupply\": \"17248611.00\",\n" +
            "      \"tsupply\": \"17348611\",\n" +
            "      \"msupply\": \"21000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"108\",\n" +
            "      \"symbol\": \"LSK\",\n" +
            "      \"name\": \"Lisk\",\n" +
            "      \"nameid\": \"lisk\",\n" +
            "      \"rank\": 39,\n" +
            "      \"price_usd\": \"0.962906\",\n" +
            "      \"percent_change_24h\": \"-1.02\",\n" +
            "      \"percent_change_1h\": \"-0.55\",\n" +
            "      \"percent_change_7d\": \"-6.72\",\n" +
            "      \"price_btc\": \"0.000151\",\n" +
            "      \"market_cap_usd\": \"115176252.80\",\n" +
            "      \"volume24\": 2608438.894896122,\n" +
            "      \"volume24a\": 2836790.691065938,\n" +
            "      \"csupply\": \"119613215.00\",\n" +
            "      \"tsupply\": \"125643660\",\n" +
            "      \"msupply\": \"159918400\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"237\",\n" +
            "      \"symbol\": \"QTUM\",\n" +
            "      \"name\": \"Qtum\",\n" +
            "      \"nameid\": \"qtum\",\n" +
            "      \"rank\": 40,\n" +
            "      \"price_usd\": \"1.19\",\n" +
            "      \"percent_change_24h\": \"-1.04\",\n" +
            "      \"percent_change_1h\": \"-0.35\",\n" +
            "      \"percent_change_7d\": \"-2.57\",\n" +
            "      \"price_btc\": \"0.000187\",\n" +
            "      \"market_cap_usd\": \"114496446.37\",\n" +
            "      \"volume24\": 284207767.41182405,\n" +
            "      \"volume24a\": 316827921.6176947,\n" +
            "      \"csupply\": \"95969372.00\",\n" +
            "      \"tsupply\": \"100909224\",\n" +
            "      \"msupply\": \"100909224\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"129\",\n" +
            "      \"symbol\": \"REP\",\n" +
            "      \"name\": \"Augur\",\n" +
            "      \"nameid\": \"augur\",\n" +
            "      \"rank\": 41,\n" +
            "      \"price_usd\": \"10.30\",\n" +
            "      \"percent_change_24h\": \"3.04\",\n" +
            "      \"percent_change_1h\": \"-1.76\",\n" +
            "      \"percent_change_7d\": \"22.16\",\n" +
            "      \"price_btc\": \"0.001612\",\n" +
            "      \"market_cap_usd\": \"113297139.40\",\n" +
            "      \"volume24\": 11180854.205671249,\n" +
            "      \"volume24a\": 10457881.669056663,\n" +
            "      \"csupply\": \"11000000.00\",\n" +
            "      \"tsupply\": \"11000000\",\n" +
            "      \"msupply\": \"11000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"3708\",\n" +
            "      \"symbol\": \"ICX\",\n" +
            "      \"name\": \"ICON\",\n" +
            "      \"nameid\": \"icon\",\n" +
            "      \"rank\": 42,\n" +
            "      \"price_usd\": \"0.206703\",\n" +
            "      \"percent_change_24h\": \"1.03\",\n" +
            "      \"percent_change_1h\": \"-0.66\",\n" +
            "      \"percent_change_7d\": \"4.56\",\n" +
            "      \"price_btc\": \"0.000032\",\n" +
            "      \"market_cap_usd\": \"101378354.73\",\n" +
            "      \"volume24\": 22364601.744351134,\n" +
            "      \"volume24a\": 16478134.361144826,\n" +
            "      \"csupply\": \"490453303.00\",\n" +
            "      \"tsupply\": \"800460000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33821\",\n" +
            "      \"symbol\": \"ABBC\",\n" +
            "      \"name\": \"ABBC Coin\",\n" +
            "      \"nameid\": \"abbc-coin\",\n" +
            "      \"rank\": 43,\n" +
            "      \"price_usd\": \"0.091603\",\n" +
            "      \"percent_change_24h\": \"-0.53\",\n" +
            "      \"percent_change_1h\": \"-0.32\",\n" +
            "      \"percent_change_7d\": \"-5.83\",\n" +
            "      \"price_btc\": \"0.000014\",\n" +
            "      \"market_cap_usd\": \"91967367.34\",\n" +
            "      \"volume24\": 19689765.930961214,\n" +
            "      \"volume24a\": 16817137.320449796,\n" +
            "      \"csupply\": \"1003981087.00\",\n" +
            "      \"tsupply\": \"1003981087\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2729\",\n" +
            "      \"symbol\": \"ZRX\",\n" +
            "      \"name\": \"0x\",\n" +
            "      \"nameid\": \"0x\",\n" +
            "      \"rank\": 44,\n" +
            "      \"price_usd\": \"0.150454\",\n" +
            "      \"percent_change_24h\": \"0.00\",\n" +
            "      \"percent_change_1h\": \"-0.33\",\n" +
            "      \"percent_change_7d\": \"-0.48\",\n" +
            "      \"price_btc\": \"0.000024\",\n" +
            "      \"market_cap_usd\": \"90343770.28\",\n" +
            "      \"volume24\": 10510688.993842537,\n" +
            "      \"volume24a\": 11664534.131497093,\n" +
            "      \"csupply\": \"600475853.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"1000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32073\",\n" +
            "      \"symbol\": \"BCD\",\n" +
            "      \"name\": \"Bitcoin Diamond\",\n" +
            "      \"nameid\": \"bitcoin-diamond\",\n" +
            "      \"rank\": 45,\n" +
            "      \"price_usd\": \"0.475540\",\n" +
            "      \"percent_change_24h\": \"3.69\",\n" +
            "      \"percent_change_1h\": \"-0.51\",\n" +
            "      \"percent_change_7d\": \"-4.56\",\n" +
            "      \"price_btc\": \"0.000074\",\n" +
            "      \"market_cap_usd\": \"88684765.14\",\n" +
            "      \"volume24\": 5938995.4973370945,\n" +
            "      \"volume24a\": 5482379.312789986,\n" +
            "      \"csupply\": \"186492898.00\",\n" +
            "      \"tsupply\": \"186492898\",\n" +
            "      \"msupply\": \"210000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33531\",\n" +
            "      \"symbol\": \"OKB\",\n" +
            "      \"name\": \"OKB\",\n" +
            "      \"nameid\": \"okb\",\n" +
            "      \"rank\": 46,\n" +
            "      \"price_usd\": \"4.23\",\n" +
            "      \"percent_change_24h\": \"0.87\",\n" +
            "      \"percent_change_1h\": \"-0.73\",\n" +
            "      \"percent_change_7d\": \"-0.43\",\n" +
            "      \"price_btc\": \"0.000663\",\n" +
            "      \"market_cap_usd\": \"84699450.59\",\n" +
            "      \"volume24\": 227134288.0321108,\n" +
            "      \"volume24a\": 228233211.8400462,\n" +
            "      \"csupply\": \"20000000.00\",\n" +
            "      \"tsupply\": \"300000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"113\",\n" +
            "      \"symbol\": \"WAVES\",\n" +
            "      \"name\": \"Waves\",\n" +
            "      \"nameid\": \"waves\",\n" +
            "      \"rank\": 47,\n" +
            "      \"price_usd\": \"0.835172\",\n" +
            "      \"percent_change_24h\": \"-0.24\",\n" +
            "      \"percent_change_1h\": \"-0.05\",\n" +
            "      \"percent_change_7d\": \"-8.77\",\n" +
            "      \"price_btc\": \"0.000131\",\n" +
            "      \"market_cap_usd\": \"83517202.35\",\n" +
            "      \"volume24\": 40133706.20585685,\n" +
            "      \"volume24a\": 40208966.7247683,\n" +
            "      \"csupply\": \"100000000.00\",\n" +
            "      \"tsupply\": \"100000000\",\n" +
            "      \"msupply\": \"100000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2750\",\n" +
            "      \"symbol\": \"KCS\",\n" +
            "      \"name\": \"KuCoin Shares\",\n" +
            "      \"nameid\": \"kucoin-shares\",\n" +
            "      \"rank\": 48,\n" +
            "      \"price_usd\": \"0.928111\",\n" +
            "      \"percent_change_24h\": \"-1.17\",\n" +
            "      \"percent_change_1h\": \"-0.96\",\n" +
            "      \"percent_change_7d\": \"-20.32\",\n" +
            "      \"price_btc\": \"0.000145\",\n" +
            "      \"market_cap_usd\": \"82365806.32\",\n" +
            "      \"volume24\": 6696660.649833733,\n" +
            "      \"volume24a\": 4572457.991561546,\n" +
            "      \"csupply\": \"88745681.00\",\n" +
            "      \"tsupply\": \"180730576\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32417\",\n" +
            "      \"symbol\": \"DAI\",\n" +
            "      \"name\": \"Dai\",\n" +
            "      \"nameid\": \"dai\",\n" +
            "      \"rank\": 49,\n" +
            "      \"price_usd\": \"1.03\",\n" +
            "      \"percent_change_24h\": \"-0.36\",\n" +
            "      \"percent_change_1h\": \"0.20\",\n" +
            "      \"percent_change_7d\": \"-0.87\",\n" +
            "      \"price_btc\": \"0.000160\",\n" +
            "      \"market_cap_usd\": \"80230531.30\",\n" +
            "      \"volume24\": 10543629.184173495,\n" +
            "      \"volume24a\": 9922404.259582814,\n" +
            "      \"csupply\": \"78262606.00\",\n" +
            "      \"tsupply\": \"78262606\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"22\",\n" +
            "      \"symbol\": \"MONA\",\n" +
            "      \"name\": \"MonaCoin\",\n" +
            "      \"nameid\": \"monacoin\",\n" +
            "      \"rank\": 50,\n" +
            "      \"price_usd\": \"1.20\",\n" +
            "      \"percent_change_24h\": \"2.03\",\n" +
            "      \"percent_change_1h\": \"-0.49\",\n" +
            "      \"percent_change_7d\": \"-5.08\",\n" +
            "      \"price_btc\": \"0.000187\",\n" +
            "      \"market_cap_usd\": \"78634534.59\",\n" +
            "      \"volume24\": 5570034.909597629,\n" +
            "      \"volume24a\": 4282033.292995447,\n" +
            "      \"csupply\": \"65729675.00\",\n" +
            "      \"tsupply\": \"65729675\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33723\",\n" +
            "      \"symbol\": \"SNX\",\n" +
            "      \"name\": \"Synthetix Network Token\",\n" +
            "      \"nameid\": \"synthetix-network-token\",\n" +
            "      \"rank\": 51,\n" +
            "      \"price_usd\": \"0.601576\",\n" +
            "      \"percent_change_24h\": \"3.13\",\n" +
            "      \"percent_change_1h\": \"-0.71\",\n" +
            "      \"percent_change_7d\": \"28.80\",\n" +
            "      \"price_btc\": \"0.000094\",\n" +
            "      \"market_cap_usd\": \"75773777.38\",\n" +
            "      \"volume24\": 1388248.3743431026,\n" +
            "      \"volume24a\": 749741.0066772816,\n" +
            "      \"csupply\": \"125958830.00\",\n" +
            "      \"tsupply\": \"125958830\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"211\",\n" +
            "      \"symbol\": \"MCO\",\n" +
            "      \"name\": \"Crypto.com\",\n" +
            "      \"nameid\": \"monaco\",\n" +
            "      \"rank\": 52,\n" +
            "      \"price_usd\": \"4.79\",\n" +
            "      \"percent_change_24h\": \"3.00\",\n" +
            "      \"percent_change_1h\": \"-0.51\",\n" +
            "      \"percent_change_7d\": \"2.38\",\n" +
            "      \"price_btc\": \"0.000750\",\n" +
            "      \"market_cap_usd\": \"75634540.24\",\n" +
            "      \"volume24\": 31343448.88472445,\n" +
            "      \"volume24a\": 28065082.376835644,\n" +
            "      \"csupply\": \"15793831.00\",\n" +
            "      \"tsupply\": \"31587682\",\n" +
            "      \"msupply\": \"31587682.3632061\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2515\",\n" +
            "      \"symbol\": \"KNC\",\n" +
            "      \"name\": \"Kyber Network\",\n" +
            "      \"nameid\": \"kyber-network\",\n" +
            "      \"rank\": 53,\n" +
            "      \"price_usd\": \"0.436348\",\n" +
            "      \"percent_change_24h\": \"-1.28\",\n" +
            "      \"percent_change_1h\": \"-0.82\",\n" +
            "      \"percent_change_7d\": \"-6.37\",\n" +
            "      \"price_btc\": \"0.000068\",\n" +
            "      \"market_cap_usd\": \"73247348.45\",\n" +
            "      \"volume24\": 38095359.15954919,\n" +
            "      \"volume24a\": 42221928.143738665,\n" +
            "      \"csupply\": \"167864614.00\",\n" +
            "      \"tsupply\": \"215625349\",\n" +
            "      \"msupply\": \"226000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2581\",\n" +
            "      \"symbol\": \"ENJ\",\n" +
            "      \"name\": \"Enjin Coin\",\n" +
            "      \"nameid\": \"enjin-coin\",\n" +
            "      \"rank\": 54,\n" +
            "      \"price_usd\": \"0.094204\",\n" +
            "      \"percent_change_24h\": \"6.40\",\n" +
            "      \"percent_change_1h\": \"-0.18\",\n" +
            "      \"percent_change_7d\": \"27.43\",\n" +
            "      \"price_btc\": \"0.000015\",\n" +
            "      \"market_cap_usd\": \"73128262.03\",\n" +
            "      \"volume24\": 7831768.35936484,\n" +
            "      \"volume24a\": 5837469.765396422,\n" +
            "      \"csupply\": \"776278713.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"232\",\n" +
            "      \"symbol\": \"OMG\",\n" +
            "      \"name\": \"OmiseGO\",\n" +
            "      \"nameid\": \"omisego\",\n" +
            "      \"rank\": 55,\n" +
            "      \"price_usd\": \"0.509032\",\n" +
            "      \"percent_change_24h\": \"0.94\",\n" +
            "      \"percent_change_1h\": \"-0.68\",\n" +
            "      \"percent_change_7d\": \"1.71\",\n" +
            "      \"price_btc\": \"0.000080\",\n" +
            "      \"market_cap_usd\": \"71389360.98\",\n" +
            "      \"volume24\": 103534220.89920342,\n" +
            "      \"volume24a\": 120744216.94034974,\n" +
            "      \"csupply\": \"140245398.00\",\n" +
            "      \"tsupply\": \"140245398\",\n" +
            "      \"msupply\": \"140245398\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32386\",\n" +
            "      \"symbol\": \"RVN\",\n" +
            "      \"name\": \"Ravencoin\",\n" +
            "      \"nameid\": \"ravencoin\",\n" +
            "      \"rank\": 56,\n" +
            "      \"price_usd\": \"0.014757\",\n" +
            "      \"percent_change_24h\": \"1.08\",\n" +
            "      \"percent_change_1h\": \"-0.74\",\n" +
            "      \"percent_change_7d\": \"0.54\",\n" +
            "      \"price_btc\": \"0.000002\",\n" +
            "      \"market_cap_usd\": \"63109300.49\",\n" +
            "      \"volume24\": 8836970.60426786,\n" +
            "      \"volume24a\": 7803875.116037616,\n" +
            "      \"csupply\": \"4276480000.00\",\n" +
            "      \"tsupply\": \"4276480000\",\n" +
            "      \"msupply\": \"21000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2835\",\n" +
            "      \"symbol\": \"NANO\",\n" +
            "      \"name\": \"Nano\",\n" +
            "      \"nameid\": \"nano\",\n" +
            "      \"rank\": 57,\n" +
            "      \"price_usd\": \"0.464030\",\n" +
            "      \"percent_change_24h\": \"0.49\",\n" +
            "      \"percent_change_1h\": \"-0.36\",\n" +
            "      \"percent_change_7d\": \"-4.29\",\n" +
            "      \"price_btc\": \"0.000073\",\n" +
            "      \"market_cap_usd\": \"61831144.00\",\n" +
            "      \"volume24\": 2239889.1368610645,\n" +
            "      \"volume24a\": 2164610.02517017,\n" +
            "      \"csupply\": \"133248297.00\",\n" +
            "      \"tsupply\": \"133248297\",\n" +
            "      \"msupply\": \"133248297\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"207\",\n" +
            "      \"symbol\": \"SNT\",\n" +
            "      \"name\": \"Status Network Token\",\n" +
            "      \"nameid\": \"status\",\n" +
            "      \"rank\": 58,\n" +
            "      \"price_usd\": \"0.017491\",\n" +
            "      \"percent_change_24h\": \"-2.37\",\n" +
            "      \"percent_change_1h\": \"-0.87\",\n" +
            "      \"percent_change_7d\": \"16.51\",\n" +
            "      \"price_btc\": \"0.000003\",\n" +
            "      \"market_cap_usd\": \"60703302.54\",\n" +
            "      \"volume24\": 39815482.424553655,\n" +
            "      \"volume24a\": 51503230.70233764,\n" +
            "      \"csupply\": \"3470483788.00\",\n" +
            "      \"tsupply\": \"6804870174\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32604\",\n" +
            "      \"symbol\": \"NEXO\",\n" +
            "      \"name\": \"Nexo\",\n" +
            "      \"nameid\": \"nexo\",\n" +
            "      \"rank\": 59,\n" +
            "      \"price_usd\": \"0.106250\",\n" +
            "      \"percent_change_24h\": \"1.36\",\n" +
            "      \"percent_change_1h\": \"-0.46\",\n" +
            "      \"percent_change_7d\": \"-0.33\",\n" +
            "      \"price_btc\": \"0.000017\",\n" +
            "      \"market_cap_usd\": \"59500155.64\",\n" +
            "      \"volume24\": 9615172.100646242,\n" +
            "      \"volume24a\": 10019116.2080828,\n" +
            "      \"csupply\": \"560000011.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33071\",\n" +
            "      \"symbol\": \"DX\",\n" +
            "      \"name\": \"DxChain Token\",\n" +
            "      \"nameid\": \"dxchain-token\",\n" +
            "      \"rank\": 60,\n" +
            "      \"price_usd\": \"0.001257\",\n" +
            "      \"percent_change_24h\": \"2.58\",\n" +
            "      \"percent_change_1h\": \"-2.68\",\n" +
            "      \"percent_change_7d\": \"-5.30\",\n" +
            "      \"price_btc\": \"1.97E-7\",\n" +
            "      \"market_cap_usd\": \"58145145.21\",\n" +
            "      \"volume24\": 1454154.9503725695,\n" +
            "      \"volume24a\": 1366887.5560371988,\n" +
            "      \"csupply\": \"46250000000.00\",\n" +
            "      \"tsupply\": \"100000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"43\",\n" +
            "      \"symbol\": \"DGB\",\n" +
            "      \"name\": \"Digibyte\",\n" +
            "      \"nameid\": \"digibyte\",\n" +
            "      \"rank\": 61,\n" +
            "      \"price_usd\": \"0.004424\",\n" +
            "      \"percent_change_24h\": \"-1.27\",\n" +
            "      \"percent_change_1h\": \"-0.20\",\n" +
            "      \"percent_change_7d\": \"27.41\",\n" +
            "      \"price_btc\": \"6.92E-7\",\n" +
            "      \"market_cap_usd\": \"57294099.48\",\n" +
            "      \"volume24\": 849548.5525020466,\n" +
            "      \"volume24a\": 850488.5142648282,\n" +
            "      \"csupply\": \"12950710845.00\",\n" +
            "      \"tsupply\": \"12950710845\",\n" +
            "      \"msupply\": \"21000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2482\",\n" +
            "      \"symbol\": \"BTM\",\n" +
            "      \"name\": \"Bytom\",\n" +
            "      \"nameid\": \"bytom\",\n" +
            "      \"rank\": 62,\n" +
            "      \"price_usd\": \"0.055880\",\n" +
            "      \"percent_change_24h\": \"-6.52\",\n" +
            "      \"percent_change_1h\": \"-0.81\",\n" +
            "      \"percent_change_7d\": \"-0.17\",\n" +
            "      \"price_btc\": \"0.000009\",\n" +
            "      \"market_cap_usd\": \"56019245.25\",\n" +
            "      \"volume24\": 151548706.31363395,\n" +
            "      \"volume24a\": 123215750.25688772,\n" +
            "      \"csupply\": \"1002499275.00\",\n" +
            "      \"tsupply\": \"1407000000\",\n" +
            "      \"msupply\": \"1407000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"183\",\n" +
            "      \"symbol\": \"SC\",\n" +
            "      \"name\": \"Siacoin\",\n" +
            "      \"nameid\": \"siacoin\",\n" +
            "      \"rank\": 63,\n" +
            "      \"price_usd\": \"0.001255\",\n" +
            "      \"percent_change_24h\": \"-1.06\",\n" +
            "      \"percent_change_1h\": \"-0.36\",\n" +
            "      \"percent_change_7d\": \"-5.95\",\n" +
            "      \"price_btc\": \"1.96E-7\",\n" +
            "      \"market_cap_usd\": \"52467734.81\",\n" +
            "      \"volume24\": 2395817.2991364556,\n" +
            "      \"volume24a\": 2707779.305690772,\n" +
            "      \"csupply\": \"41817047634.00\",\n" +
            "      \"tsupply\": \"41817047634\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32957\",\n" +
            "      \"symbol\": \"NRG\",\n" +
            "      \"name\": \"Energi\",\n" +
            "      \"nameid\": \"energi\",\n" +
            "      \"rank\": 64,\n" +
            "      \"price_usd\": \"1.95\",\n" +
            "      \"percent_change_24h\": \"3.78\",\n" +
            "      \"percent_change_1h\": \"-0.60\",\n" +
            "      \"percent_change_7d\": \"40.12\",\n" +
            "      \"price_btc\": \"0.000305\",\n" +
            "      \"market_cap_usd\": \"52406760.60\",\n" +
            "      \"volume24\": 431226.13477206306,\n" +
            "      \"volume24a\": 239952.8137357923,\n" +
            "      \"csupply\": \"26892599.00\",\n" +
            "      \"tsupply\": \"26892599\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32360\",\n" +
            "      \"symbol\": \"THETA\",\n" +
            "      \"name\": \"Theta Token\",\n" +
            "      \"nameid\": \"theta-token\",\n" +
            "      \"rank\": 65,\n" +
            "      \"price_usd\": \"0.072927\",\n" +
            "      \"percent_change_24h\": \"2.46\",\n" +
            "      \"percent_change_1h\": \"0.08\",\n" +
            "      \"percent_change_7d\": \"5.18\",\n" +
            "      \"price_btc\": \"0.000011\",\n" +
            "      \"market_cap_usd\": \"51523357.63\",\n" +
            "      \"volume24\": 2112268.4526818087,\n" +
            "      \"volume24a\": 1881750.9642567704,\n" +
            "      \"csupply\": \"706502689.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"111\",\n" +
            "      \"symbol\": \"DGD\",\n" +
            "      \"name\": \"DigixDAO\",\n" +
            "      \"nameid\": \"digixdao\",\n" +
            "      \"rank\": 66,\n" +
            "      \"price_usd\": \"25.21\",\n" +
            "      \"percent_change_24h\": \"-1.27\",\n" +
            "      \"percent_change_1h\": \"-0.38\",\n" +
            "      \"percent_change_7d\": \"-0.21\",\n" +
            "      \"price_btc\": \"0.003946\",\n" +
            "      \"market_cap_usd\": \"50429839.25\",\n" +
            "      \"volume24\": 946048.5636321795,\n" +
            "      \"volume24a\": 927246.9674276358,\n" +
            "      \"csupply\": \"2000000.00\",\n" +
            "      \"tsupply\": \"2000000\",\n" +
            "      \"msupply\": \"2000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"106\",\n" +
            "      \"symbol\": \"STEEM\",\n" +
            "      \"name\": \"STEEM\",\n" +
            "      \"nameid\": \"steem\",\n" +
            "      \"rank\": 67,\n" +
            "      \"price_usd\": \"0.143346\",\n" +
            "      \"percent_change_24h\": \"-0.45\",\n" +
            "      \"percent_change_1h\": \"-1.11\",\n" +
            "      \"percent_change_7d\": \"-14.05\",\n" +
            "      \"price_btc\": \"0.000022\",\n" +
            "      \"market_cap_usd\": \"49075319.52\",\n" +
            "      \"volume24\": 1547053.818875123,\n" +
            "      \"volume24a\": 1566802.1180097447,\n" +
            "      \"csupply\": \"342356149.00\",\n" +
            "      \"tsupply\": \"342356149\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33391\",\n" +
            "      \"symbol\": \"BTT\",\n" +
            "      \"name\": \"BitTorrent\",\n" +
            "      \"nameid\": \"bittorrent\",\n" +
            "      \"rank\": 68,\n" +
            "      \"price_usd\": \"0.000220\",\n" +
            "      \"percent_change_24h\": \"1.42\",\n" +
            "      \"percent_change_1h\": \"-0.52\",\n" +
            "      \"percent_change_7d\": \"0.63\",\n" +
            "      \"price_btc\": \"3.44E-8\",\n" +
            "      \"market_cap_usd\": \"46655687.41\",\n" +
            "      \"volume24\": 4457485.39464261,\n" +
            "      \"volume24a\": 4194047.916446663,\n" +
            "      \"csupply\": \"212116500000.00\",\n" +
            "      \"tsupply\": \"990000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32686\",\n" +
            "      \"symbol\": \"HOT\",\n" +
            "      \"name\": \"Holo\",\n" +
            "      \"nameid\": \"holo\",\n" +
            "      \"rank\": 69,\n" +
            "      \"price_usd\": \"0.000330\",\n" +
            "      \"percent_change_24h\": \"-1.84\",\n" +
            "      \"percent_change_1h\": \"-1.33\",\n" +
            "      \"percent_change_7d\": \"1.33\",\n" +
            "      \"price_btc\": \"5.17E-8\",\n" +
            "      \"market_cap_usd\": \"44010774.52\",\n" +
            "      \"volume24\": 2956404.200846171,\n" +
            "      \"volume24a\": 3191213.0203229696,\n" +
            "      \"csupply\": \"133214575156.00\",\n" +
            "      \"tsupply\": \"177619433541\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"54\",\n" +
            "      \"symbol\": \"BTS\",\n" +
            "      \"name\": \"BitShares\",\n" +
            "      \"nameid\": \"bitshares\",\n" +
            "      \"rank\": 70,\n" +
            "      \"price_usd\": \"0.016006\",\n" +
            "      \"percent_change_24h\": \"-0.68\",\n" +
            "      \"percent_change_1h\": \"-0.41\",\n" +
            "      \"percent_change_7d\": \"-7.04\",\n" +
            "      \"price_btc\": \"0.000003\",\n" +
            "      \"market_cap_usd\": \"43871164.08\",\n" +
            "      \"volume24\": 2960784.8929649456,\n" +
            "      \"volume24a\": 5319645.169082643,\n" +
            "      \"csupply\": \"2740910000.00\",\n" +
            "      \"tsupply\": \"2740910000\",\n" +
            "      \"msupply\": \"3600570502\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33085\",\n" +
            "      \"symbol\": \"QNT\",\n" +
            "      \"name\": \"Quant\",\n" +
            "      \"nameid\": \"quant\",\n" +
            "      \"rank\": 71,\n" +
            "      \"price_usd\": \"3.60\",\n" +
            "      \"percent_change_24h\": \"-1.14\",\n" +
            "      \"percent_change_1h\": \"-2.06\",\n" +
            "      \"percent_change_7d\": \"46.27\",\n" +
            "      \"price_btc\": \"0.000564\",\n" +
            "      \"market_cap_usd\": \"43510426.32\",\n" +
            "      \"volume24\": 3008363.1545969727,\n" +
            "      \"volume24a\": 3109893.8894050317,\n" +
            "      \"csupply\": \"12072738.00\",\n" +
            "      \"tsupply\": \"45467000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33228\",\n" +
            "      \"symbol\": \"HC\",\n" +
            "      \"name\": \"HyperCash\",\n" +
            "      \"nameid\": \"hypercash\",\n" +
            "      \"rank\": 72,\n" +
            "      \"price_usd\": \"0.960606\",\n" +
            "      \"percent_change_24h\": \"0.28\",\n" +
            "      \"percent_change_1h\": \"-0.55\",\n" +
            "      \"percent_change_7d\": \"-3.87\",\n" +
            "      \"price_btc\": \"0.000150\",\n" +
            "      \"market_cap_usd\": \"41814970.21\",\n" +
            "      \"volume24\": 645742.6599156265,\n" +
            "      \"volume24a\": 664898.6929554078,\n" +
            "      \"csupply\": \"43529781.00\",\n" +
            "      \"tsupply\": \"43529781\",\n" +
            "      \"msupply\": \"84000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"139\",\n" +
            "      \"symbol\": \"KMD\",\n" +
            "      \"name\": \"Komodo\",\n" +
            "      \"nameid\": \"komodo\",\n" +
            "      \"rank\": 73,\n" +
            "      \"price_usd\": \"0.361466\",\n" +
            "      \"percent_change_24h\": \"0.34\",\n" +
            "      \"percent_change_1h\": \"-0.68\",\n" +
            "      \"percent_change_7d\": \"-2.93\",\n" +
            "      \"price_btc\": \"0.000057\",\n" +
            "      \"market_cap_usd\": \"41800824.54\",\n" +
            "      \"volume24\": 1590999.723028095,\n" +
            "      \"volume24a\": 1895616.5930567307,\n" +
            "      \"csupply\": \"115642437.00\",\n" +
            "      \"tsupply\": \"115642437\",\n" +
            "      \"msupply\": \"200000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"186\",\n" +
            "      \"symbol\": \"ZEN\",\n" +
            "      \"name\": \"Horizen\",\n" +
            "      \"nameid\": \"zencash\",\n" +
            "      \"rank\": 74,\n" +
            "      \"price_usd\": \"5.57\",\n" +
            "      \"percent_change_24h\": \"-3.55\",\n" +
            "      \"percent_change_1h\": \"-1.27\",\n" +
            "      \"percent_change_7d\": \"4.09\",\n" +
            "      \"price_btc\": \"0.000872\",\n" +
            "      \"market_cap_usd\": \"40038817.02\",\n" +
            "      \"volume24\": 1497903.7970932266,\n" +
            "      \"volume24a\": 1852373.6737611722,\n" +
            "      \"csupply\": \"7185725.00\",\n" +
            "      \"tsupply\": \"7185725\",\n" +
            "      \"msupply\": \"21000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33535\",\n" +
            "      \"symbol\": \"VSYS\",\n" +
            "      \"name\": \"V Systems\",\n" +
            "      \"nameid\": \"v-systems\",\n" +
            "      \"rank\": 75,\n" +
            "      \"price_usd\": \"0.022180\",\n" +
            "      \"percent_change_24h\": \"0.53\",\n" +
            "      \"percent_change_1h\": \"-0.76\",\n" +
            "      \"percent_change_7d\": \"-9.75\",\n" +
            "      \"price_btc\": \"0.000003\",\n" +
            "      \"market_cap_usd\": \"39676669.57\",\n" +
            "      \"volume24\": 4154895.8312228494,\n" +
            "      \"volume24a\": 4316484.507602155,\n" +
            "      \"csupply\": \"1788818695.00\",\n" +
            "      \"tsupply\": \"5217805440\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"34406\",\n" +
            "      \"symbol\": \"ALGO\",\n" +
            "      \"name\": \"Algorand\",\n" +
            "      \"nameid\": \"algorand\",\n" +
            "      \"rank\": 76,\n" +
            "      \"price_usd\": \"0.153018\",\n" +
            "      \"percent_change_24h\": \"-1.73\",\n" +
            "      \"percent_change_1h\": \"-0.98\",\n" +
            "      \"percent_change_7d\": \"-3.32\",\n" +
            "      \"price_btc\": \"0.000024\",\n" +
            "      \"market_cap_usd\": \"39670922.35\",\n" +
            "      \"volume24\": 36950237.63932698,\n" +
            "      \"volume24a\": 36503400.18220688,\n" +
            "      \"csupply\": \"259256762.00\",\n" +
            "      \"tsupply\": \"2588969743\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"102\",\n" +
            "      \"symbol\": \"XVG\",\n" +
            "      \"name\": \"Verge\",\n" +
            "      \"nameid\": \"verge\",\n" +
            "      \"rank\": 77,\n" +
            "      \"price_usd\": \"0.002445\",\n" +
            "      \"percent_change_24h\": \"-3.55\",\n" +
            "      \"percent_change_1h\": \"-0.74\",\n" +
            "      \"percent_change_7d\": \"-1.41\",\n" +
            "      \"price_btc\": \"3.83E-7\",\n" +
            "      \"market_cap_usd\": \"38870981.39\",\n" +
            "      \"volume24\": 944862.2463321749,\n" +
            "      \"volume24a\": 1659834.995466128,\n" +
            "      \"csupply\": \"15900663549.00\",\n" +
            "      \"tsupply\": \"15900663549\",\n" +
            "      \"msupply\": \"16555000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33529\",\n" +
            "      \"symbol\": \"ZB\",\n" +
            "      \"name\": \"ZB\",\n" +
            "      \"nameid\": \"zb\",\n" +
            "      \"rank\": 78,\n" +
            "      \"price_usd\": \"0.219365\",\n" +
            "      \"percent_change_24h\": \"-3.10\",\n" +
            "      \"percent_change_1h\": \"-0.64\",\n" +
            "      \"percent_change_7d\": \"-5.09\",\n" +
            "      \"price_btc\": \"0.000034\",\n" +
            "      \"market_cap_usd\": \"35800101.88\",\n" +
            "      \"volume24\": 32807468.331560288,\n" +
            "      \"volume24a\": 34427566.5135152,\n" +
            "      \"csupply\": \"163198810.00\",\n" +
            "      \"tsupply\": \"2100000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32229\",\n" +
            "      \"symbol\": \"IOST\",\n" +
            "      \"name\": \"IOStoken\",\n" +
            "      \"nameid\": \"iostoken\",\n" +
            "      \"rank\": 79,\n" +
            "      \"price_usd\": \"0.002957\",\n" +
            "      \"percent_change_24h\": \"-0.05\",\n" +
            "      \"percent_change_1h\": \"-0.60\",\n" +
            "      \"percent_change_7d\": \"-8.93\",\n" +
            "      \"price_btc\": \"4.63E-7\",\n" +
            "      \"market_cap_usd\": \"35524447.59\",\n" +
            "      \"volume24\": 21851396.795646537,\n" +
            "      \"volume24a\": 20802557.45685033,\n" +
            "      \"csupply\": \"12013965609.00\",\n" +
            "      \"tsupply\": \"21000000000\",\n" +
            "      \"msupply\": \"21000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32764\",\n" +
            "      \"symbol\": \"SEELE\",\n" +
            "      \"name\": \"Seele\",\n" +
            "      \"nameid\": \"seele\",\n" +
            "      \"rank\": 80,\n" +
            "      \"price_usd\": \"0.048728\",\n" +
            "      \"percent_change_24h\": \"0.89\",\n" +
            "      \"percent_change_1h\": \"0.17\",\n" +
            "      \"percent_change_7d\": \"-3.80\",\n" +
            "      \"price_btc\": \"0.000008\",\n" +
            "      \"market_cap_usd\": \"33757662.18\",\n" +
            "      \"volume24\": 11690183.879199171,\n" +
            "      \"volume24a\": 11666055.916088145,\n" +
            "      \"csupply\": \"692776387.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32334\",\n" +
            "      \"symbol\": \"ZIL\",\n" +
            "      \"name\": \"Zilliqa\",\n" +
            "      \"nameid\": \"zilliqa\",\n" +
            "      \"rank\": 81,\n" +
            "      \"price_usd\": \"0.003777\",\n" +
            "      \"percent_change_24h\": \"0.05\",\n" +
            "      \"percent_change_1h\": \"-0.07\",\n" +
            "      \"percent_change_7d\": \"-2.22\",\n" +
            "      \"price_btc\": \"5.91E-7\",\n" +
            "      \"market_cap_usd\": \"32815458.09\",\n" +
            "      \"volume24\": 6441653.807699411,\n" +
            "      \"volume24a\": 6404486.82732105,\n" +
            "      \"csupply\": \"8687360058.00\",\n" +
            "      \"tsupply\": \"12600000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"131\",\n" +
            "      \"symbol\": \"ARDR\",\n" +
            "      \"name\": \"Ardor\",\n" +
            "      \"nameid\": \"ardor\",\n" +
            "      \"rank\": 82,\n" +
            "      \"price_usd\": \"0.032605\",\n" +
            "      \"percent_change_24h\": \"0.06\",\n" +
            "      \"percent_change_1h\": \"-0.29\",\n" +
            "      \"percent_change_7d\": \"-4.23\",\n" +
            "      \"price_btc\": \"0.000005\",\n" +
            "      \"market_cap_usd\": \"32572473.36\",\n" +
            "      \"volume24\": 485141.1935712839,\n" +
            "      \"volume24a\": 639902.692901471,\n" +
            "      \"csupply\": \"998999495.00\",\n" +
            "      \"tsupply\": \"998999495\",\n" +
            "      \"msupply\": \"998999495\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"156\",\n" +
            "      \"symbol\": \"GNT\",\n" +
            "      \"name\": \"Golem\",\n" +
            "      \"nameid\": \"golem-network-tokens\",\n" +
            "      \"rank\": 83,\n" +
            "      \"price_usd\": \"0.033263\",\n" +
            "      \"percent_change_24h\": \"0.07\",\n" +
            "      \"percent_change_1h\": \"-0.44\",\n" +
            "      \"percent_change_7d\": \"-4.87\",\n" +
            "      \"price_btc\": \"0.000005\",\n" +
            "      \"market_cap_usd\": \"32080954.23\",\n" +
            "      \"volume24\": 2323549.0104945838,\n" +
            "      \"volume24a\": 1981928.9773706147,\n" +
            "      \"csupply\": \"964450000.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2765\",\n" +
            "      \"symbol\": \"DATA\",\n" +
            "      \"name\": \"Streamr DATAcoin\",\n" +
            "      \"nameid\": \"streamr-datacoin\",\n" +
            "      \"rank\": 84,\n" +
            "      \"price_usd\": \"0.044067\",\n" +
            "      \"percent_change_24h\": \"-1.16\",\n" +
            "      \"percent_change_1h\": \"-2.33\",\n" +
            "      \"percent_change_7d\": \"48.02\",\n" +
            "      \"price_btc\": \"0.000007\",\n" +
            "      \"market_cap_usd\": \"29839864.63\",\n" +
            "      \"volume24\": 3587380.051549011,\n" +
            "      \"volume24a\": 4537618.526798132,\n" +
            "      \"csupply\": \"677154514.00\",\n" +
            "      \"tsupply\": \"987154514\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32226\",\n" +
            "      \"symbol\": \"ELF\",\n" +
            "      \"name\": \"aelf\",\n" +
            "      \"nameid\": \"aelf\",\n" +
            "      \"rank\": 85,\n" +
            "      \"price_usd\": \"0.059519\",\n" +
            "      \"percent_change_24h\": \"5.86\",\n" +
            "      \"percent_change_1h\": \"-1.98\",\n" +
            "      \"percent_change_7d\": \"5.05\",\n" +
            "      \"price_btc\": \"0.000009\",\n" +
            "      \"market_cap_usd\": \"29746369.56\",\n" +
            "      \"volume24\": 46014730.612219416,\n" +
            "      \"volume24a\": 26144768.677850265,\n" +
            "      \"csupply\": \"499780000.00\",\n" +
            "      \"tsupply\": \"499780000\",\n" +
            "      \"msupply\": \"1000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2732\",\n" +
            "      \"symbol\": \"GXS\",\n" +
            "      \"name\": \"GXChain\",\n" +
            "      \"nameid\": \"gxchain\",\n" +
            "      \"rank\": 86,\n" +
            "      \"price_usd\": \"0.429658\",\n" +
            "      \"percent_change_24h\": \"2.83\",\n" +
            "      \"percent_change_1h\": \"-2.37\",\n" +
            "      \"percent_change_7d\": \"34.27\",\n" +
            "      \"price_btc\": \"0.000067\",\n" +
            "      \"market_cap_usd\": \"27927760.62\",\n" +
            "      \"volume24\": 1014172.7921014958,\n" +
            "      \"volume24a\": 588350.8729236424,\n" +
            "      \"csupply\": \"65000000.00\",\n" +
            "      \"tsupply\": \"100000000\",\n" +
            "      \"msupply\": \"100000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32238\",\n" +
            "      \"symbol\": \"WAX\",\n" +
            "      \"name\": \"WAX\",\n" +
            "      \"nameid\": \"wax\",\n" +
            "      \"rank\": 87,\n" +
            "      \"price_usd\": \"0.029263\",\n" +
            "      \"percent_change_24h\": \"-0.98\",\n" +
            "      \"percent_change_1h\": \"-0.38\",\n" +
            "      \"percent_change_7d\": \"-8.03\",\n" +
            "      \"price_btc\": \"0.000005\",\n" +
            "      \"market_cap_usd\": \"27589874.84\",\n" +
            "      \"volume24\": 97615.36670364332,\n" +
            "      \"volume24a\": 102905.35031917984,\n" +
            "      \"csupply\": \"942821662.00\",\n" +
            "      \"tsupply\": \"1850000000\",\n" +
            "      \"msupply\": \"1850000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2731\",\n" +
            "      \"symbol\": \"AE\",\n" +
            "      \"name\": \"Aeternity\",\n" +
            "      \"nameid\": \"aeternity\",\n" +
            "      \"rank\": 88,\n" +
            "      \"price_usd\": \"0.096011\",\n" +
            "      \"percent_change_24h\": \"1.00\",\n" +
            "      \"percent_change_1h\": \"-0.28\",\n" +
            "      \"percent_change_7d\": \"-3.14\",\n" +
            "      \"price_btc\": \"0.000015\",\n" +
            "      \"market_cap_usd\": \"26914982.28\",\n" +
            "      \"volume24\": 9013128.350070003,\n" +
            "      \"volume24a\": 6879811.935336234,\n" +
            "      \"csupply\": \"280333087.00\",\n" +
            "      \"tsupply\": \"280333087\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"258\",\n" +
            "      \"symbol\": \"MANA\",\n" +
            "      \"name\": \"Decentraland\",\n" +
            "      \"nameid\": \"decentraland\",\n" +
            "      \"rank\": 89,\n" +
            "      \"price_usd\": \"0.025008\",\n" +
            "      \"percent_change_24h\": \"0.77\",\n" +
            "      \"percent_change_1h\": \"-0.05\",\n" +
            "      \"percent_change_7d\": \"-0.82\",\n" +
            "      \"price_btc\": \"0.000004\",\n" +
            "      \"market_cap_usd\": \"26261828.24\",\n" +
            "      \"volume24\": 18380840.022441138,\n" +
            "      \"volume24a\": 21069402.54334631,\n" +
            "      \"csupply\": \"1050141509.00\",\n" +
            "      \"tsupply\": \"2644403343\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32390\",\n" +
            "      \"symbol\": \"REN\",\n" +
            "      \"name\": \"Republic Protocol\",\n" +
            "      \"nameid\": \"republic-protocol\",\n" +
            "      \"rank\": 90,\n" +
            "      \"price_usd\": \"0.044295\",\n" +
            "      \"percent_change_24h\": \"4.60\",\n" +
            "      \"percent_change_1h\": \"-0.29\",\n" +
            "      \"percent_change_7d\": \"8.25\",\n" +
            "      \"price_btc\": \"0.000007\",\n" +
            "      \"market_cap_usd\": \"26057277.58\",\n" +
            "      \"volume24\": 1024457.375536042,\n" +
            "      \"volume24a\": 635027.8855000794,\n" +
            "      \"csupply\": \"588261205.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32338\",\n" +
            "      \"symbol\": \"WICC\",\n" +
            "      \"name\": \"WaykiChain\",\n" +
            "      \"nameid\": \"waykichain\",\n" +
            "      \"rank\": 91,\n" +
            "      \"price_usd\": \"0.136951\",\n" +
            "      \"percent_change_24h\": \"-0.53\",\n" +
            "      \"percent_change_1h\": \"-0.06\",\n" +
            "      \"percent_change_7d\": \"-10.98\",\n" +
            "      \"price_btc\": \"0.000021\",\n" +
            "      \"market_cap_usd\": \"25883827.56\",\n" +
            "      \"volume24\": 690910.384590201,\n" +
            "      \"volume24a\": 776596.5756505831,\n" +
            "      \"csupply\": \"189000000.00\",\n" +
            "      \"tsupply\": \"210000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"120\",\n" +
            "      \"symbol\": \"STRAT\",\n" +
            "      \"name\": \"Stratis\",\n" +
            "      \"nameid\": \"stratis\",\n" +
            "      \"rank\": 92,\n" +
            "      \"price_usd\": \"0.258419\",\n" +
            "      \"percent_change_24h\": \"8.85\",\n" +
            "      \"percent_change_1h\": \"-0.65\",\n" +
            "      \"percent_change_7d\": \"-0.26\",\n" +
            "      \"price_btc\": \"0.000040\",\n" +
            "      \"market_cap_usd\": \"25771849.24\",\n" +
            "      \"volume24\": 1167653.3300112349,\n" +
            "      \"volume24a\": 391315.07749983214,\n" +
            "      \"csupply\": \"99729045.00\",\n" +
            "      \"tsupply\": \"99729045\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32342\",\n" +
            "      \"symbol\": \"NPXS\",\n" +
            "      \"name\": \"Pundi X\",\n" +
            "      \"nameid\": \"pundi-x\",\n" +
            "      \"rank\": 93,\n" +
            "      \"price_usd\": \"0.000109\",\n" +
            "      \"percent_change_24h\": \"-0.86\",\n" +
            "      \"percent_change_1h\": \"-0.31\",\n" +
            "      \"percent_change_7d\": \"-1.62\",\n" +
            "      \"price_btc\": \"1.71E-8\",\n" +
            "      \"market_cap_usd\": \"25726715.23\",\n" +
            "      \"volume24\": 708188.6702732255,\n" +
            "      \"volume24a\": 747658.2746914695,\n" +
            "      \"csupply\": \"235171468515.00\",\n" +
            "      \"tsupply\": \"280255193861\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33548\",\n" +
            "      \"symbol\": \"NEX\",\n" +
            "      \"name\": \"Nash Exchange\",\n" +
            "      \"nameid\": \"nash-exchange\",\n" +
            "      \"rank\": 94,\n" +
            "      \"price_usd\": \"0.704643\",\n" +
            "      \"percent_change_24h\": \"4.86\",\n" +
            "      \"percent_change_1h\": \"-1.00\",\n" +
            "      \"percent_change_7d\": \"1.95\",\n" +
            "      \"price_btc\": \"0.000110\",\n" +
            "      \"market_cap_usd\": \"25505720.06\",\n" +
            "      \"volume24\": 2859310.537514316,\n" +
            "      \"volume24a\": 4139323.4403952807,\n" +
            "      \"csupply\": \"36196678.00\",\n" +
            "      \"tsupply\": \"56296100\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"36419\",\n" +
            "      \"symbol\": \"CVCC\",\n" +
            "      \"name\": \"CryptoVerificationCoin\",\n" +
            "      \"nameid\": \"cryptoverificationcoin\",\n" +
            "      \"rank\": 95,\n" +
            "      \"price_usd\": \"21.73\",\n" +
            "      \"percent_change_24h\": \"0.26\",\n" +
            "      \"percent_change_1h\": \"-0.64\",\n" +
            "      \"percent_change_7d\": \"-1.67\",\n" +
            "      \"price_btc\": \"0.003401\",\n" +
            "      \"market_cap_usd\": \"25046788.09\",\n" +
            "      \"volume24\": 36417.66736394216,\n" +
            "      \"volume24a\": 51748.10933424507,\n" +
            "      \"csupply\": \"1152727.00\",\n" +
            "      \"tsupply\": \"1152727\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"166\",\n" +
            "      \"symbol\": \"RLC\",\n" +
            "      \"name\": \"iExec RLC\",\n" +
            "      \"nameid\": \"rlc\",\n" +
            "      \"rank\": 96,\n" +
            "      \"price_usd\": \"0.299259\",\n" +
            "      \"percent_change_24h\": \"3.05\",\n" +
            "      \"percent_change_1h\": \"-0.52\",\n" +
            "      \"percent_change_7d\": \"5.46\",\n" +
            "      \"price_btc\": \"0.000047\",\n" +
            "      \"market_cap_usd\": \"23961916.85\",\n" +
            "      \"volume24\": 333067.60602721263,\n" +
            "      \"volume24a\": 333733.3787431154,\n" +
            "      \"csupply\": \"80070793.00\",\n" +
            "      \"tsupply\": \"86999785\",\n" +
            "      \"msupply\": \" 87000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"264\",\n" +
            "      \"symbol\": \"RCN\",\n" +
            "      \"name\": \"Ripio Credit Network\",\n" +
            "      \"nameid\": \"ripiocreditnetwork\",\n" +
            "      \"rank\": 97,\n" +
            "      \"price_usd\": \"0.048461\",\n" +
            "      \"percent_change_24h\": \"-1.39\",\n" +
            "      \"percent_change_1h\": \"-1.43\",\n" +
            "      \"percent_change_7d\": \"15.88\",\n" +
            "      \"price_btc\": \"0.000008\",\n" +
            "      \"market_cap_usd\": \"23907313.84\",\n" +
            "      \"volume24\": 364476.85561521456,\n" +
            "      \"volume24a\": 335047.1871252921,\n" +
            "      \"csupply\": \"493330791.00\",\n" +
            "      \"tsupply\": \"999942647\",\n" +
            "      \"msupply\": \"1000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33764\",\n" +
            "      \"symbol\": \"RIF\",\n" +
            "      \"name\": \"RIF Token\",\n" +
            "      \"nameid\": \"rif-token\",\n" +
            "      \"rank\": 98,\n" +
            "      \"price_usd\": \"0.049667\",\n" +
            "      \"percent_change_24h\": \"4.30\",\n" +
            "      \"percent_change_1h\": \"0.86\",\n" +
            "      \"percent_change_7d\": \"6.25\",\n" +
            "      \"price_btc\": \"0.000008\",\n" +
            "      \"market_cap_usd\": \"23739956.78\",\n" +
            "      \"volume24\": 10695995.17901683,\n" +
            "      \"volume24a\": 8131131.2404741775,\n" +
            "      \"csupply\": \"477980957.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"95\",\n" +
            "      \"symbol\": \"MAID\",\n" +
            "      \"name\": \"MaidSafeCoin\",\n" +
            "      \"nameid\": \"maidsafecoin\",\n" +
            "      \"rank\": 99,\n" +
            "      \"price_usd\": \"0.051823\",\n" +
            "      \"percent_change_24h\": \"-0.85\",\n" +
            "      \"percent_change_1h\": \"-0.57\",\n" +
            "      \"percent_change_7d\": \"-3.38\",\n" +
            "      \"price_btc\": \"0.000008\",\n" +
            "      \"market_cap_usd\": \"23452670.48\",\n" +
            "      \"volume24\": 135070.7053308855,\n" +
            "      \"volume24a\": 134148.20998067464,\n" +
            "      \"csupply\": \"452552412.00\",\n" +
            "      \"tsupply\": \"452552412\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2781\",\n" +
            "      \"symbol\": \"LRC\",\n" +
            "      \"name\": \"Loopring\",\n" +
            "      \"nameid\": \"loopring\",\n" +
            "      \"rank\": 100,\n" +
            "      \"price_usd\": \"0.026099\",\n" +
            "      \"percent_change_24h\": \"-1.64\",\n" +
            "      \"percent_change_1h\": \"-0.72\",\n" +
            "      \"percent_change_7d\": \"-5.66\",\n" +
            "      \"price_btc\": \"0.000004\",\n" +
            "      \"market_cap_usd\": \"23445105.36\",\n" +
            "      \"volume24\": 2173686.494826264,\n" +
            "      \"volume24a\": 2249978.1665336597,\n" +
            "      \"csupply\": \"898304697.00\",\n" +
            "      \"tsupply\": \"1374956262\",\n" +
            "      \"msupply\": \"1395076055\"\n" +
            "    }\n" +
            "  ],\n" +
            "  \"info\": {\n" +
            "    \"coins_num\": 3983,\n" +
            "    \"time\": 1585654671\n" +
            "  }\n" +
            "}";

}
