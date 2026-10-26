package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AutoSprint extends Module {
   private static boolean[] id_byte;
   private static String[] id_protected;
   private static short[] id_throws;
   private static byte[] id_catch;
   public Object[] id_break;

   public AutoSprint() {
      super(id_protected[0], id_protected[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_throws[0]]);
      this.id_try();
      rrIk_1 var5 = new rrIk_1(id_protected[2], id_byte[0]);
      this.id_break[id_throws[1]] = var5;
      rrIk_1 var6 = new rrIk_1(id_protected[3], id_byte[1]);
      this.id_break[id_throws[2]] = var6;
      rrIk_1 var7 = new rrIk_1(id_protected[4], id_byte[2]);
      this.id_break[id_throws[3]] = var7;
      rrIk_1 var8 = new rrIk_1(id_protected[5], id_byte[3]);
      this.id_break[id_throws[4]] = var8;
      rrIk_1 var9 = new rrIk_1(id_protected[6], id_byte[4]);
      this.id_break[id_throws[5]] = var9;
      rrIk_1 var10 = new rrIk_1(id_protected[7], id_byte[5]);
      this.id_break[id_throws[6]] = var10;
      Setting[] var10001 = new Setting[id_catch[0]];
      byte var10003 = id_byte[6];
      String var10006 = id_protected[8];
      Setting[] var10007 = new Setting[id_catch[1]];
      var10007[id_byte[7]] = new ButtonSetting(this, id_protected[9], () -> {
         this.id_try();
         ((rrIk_1)this.id_break[id_throws[31]]).id_class(Boolean.valueOf(id_byte[60]), id_byte[61], id_byte[62]);
         ((rrIk_1)this.id_break[id_throws[32]]).id_class(Boolean.valueOf(id_byte[63]), id_byte[64], id_byte[65]);
         ((rrIk_1)this.id_break[id_throws[33]]).id_class(Boolean.valueOf(id_byte[66]), id_byte[67], id_byte[68]);
         ((rrIk_1)this.id_break[id_throws[34]]).id_class(Boolean.valueOf(id_byte[69]), id_byte[70], id_byte[71]);
         ((rrIk_1)this.id_break[id_throws[35]]).id_class(Boolean.valueOf(id_byte[72]), id_byte[73], id_byte[74]);
         ((rrIk_1)this.id_break[id_throws[36]]).id_class(Boolean.valueOf(id_byte[75]), id_byte[76], id_byte[77]);
      });
      var10007[id_byte[8]] = new ButtonSetting(this, id_protected[10], () -> {
         this.id_try();
         ((rrIk_1)this.id_break[id_throws[25]]).id_class(Boolean.valueOf(id_byte[42]), id_byte[43], id_byte[44]);
         ((rrIk_1)this.id_break[id_throws[26]]).id_class(Boolean.valueOf(id_byte[45]), id_byte[46], id_byte[47]);
         ((rrIk_1)this.id_break[id_throws[27]]).id_class(Boolean.valueOf(id_byte[48]), id_byte[49], id_byte[50]);
         ((rrIk_1)this.id_break[id_throws[28]]).id_class(Boolean.valueOf(id_byte[51]), id_byte[52], id_byte[53]);
         ((rrIk_1)this.id_break[id_throws[29]]).id_class(Boolean.valueOf(id_byte[54]), id_byte[55], id_byte[56]);
         ((rrIk_1)this.id_break[id_throws[30]]).id_class(Boolean.valueOf(id_byte[57]), id_byte[58], id_byte[59]);
      });
      var10007[id_catch[2]] = new ButtonSetting(this, id_protected[11], () -> {
         this.id_try();
         ((rrIk_1)this.id_break[id_throws[19]]).id_class(Boolean.valueOf(id_byte[24]), id_byte[25], id_byte[26]);
         ((rrIk_1)this.id_break[id_throws[20]]).id_class(Boolean.valueOf(id_byte[27]), id_byte[28], id_byte[29]);
         ((rrIk_1)this.id_break[id_throws[21]]).id_class(Boolean.valueOf(id_byte[30]), id_byte[31], id_byte[32]);
         ((rrIk_1)this.id_break[id_throws[22]]).id_class(Boolean.valueOf(id_byte[33]), id_byte[34], id_byte[35]);
         ((rrIk_1)this.id_break[id_throws[23]]).id_class(Boolean.valueOf(id_byte[36]), id_byte[37], id_byte[38]);
         ((rrIk_1)this.id_break[id_throws[24]]).id_class(Boolean.valueOf(id_byte[39]), id_byte[40], id_byte[41]);
      });
      var10001[var10003] = new GroupSetting(var10006, var10007);
      var10003 = id_byte[9];
      var10006 = id_protected[12];
      var10007 = new Setting[id_catch[3]];
      var10007[id_byte[10]] = (rrIk_1)this.id_break[id_throws[7]];
      var10007[id_byte[11]] = (rrIk_1)this.id_break[id_throws[8]];
      var10007[id_catch[4]] = (rrIk_1)this.id_break[id_throws[9]];
      var10007[id_catch[5]] = (rrIk_1)this.id_break[id_throws[10]];
      var10007[id_catch[6]] = (rrIk_1)this.id_break[id_throws[11]];
      var10007[id_catch[7]] = (rrIk_1)this.id_break[id_throws[12]];
      var10001[var10003] = new GroupSetting(var10006, var10007);
      this.id_class(var10001);
   }

   static {
      ntfClinit();
   }

   public boolean id_this() {
      this.id_try();
      return this.aJ_() && ((rrIk_1)this.id_break[id_throws[17]]).id_class() ? id_byte[20] : id_byte[21];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5324248355237797422L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -905121113;
   }

   @EventTarget
   public void id_class(I var1) {
      var1.id_class(id_byte[12]);
   }

   @EventTarget
   public void id_class(rrLX var1) {
      this.id_try();
      if (((rrIk_1)this.id_break[id_throws[13]]).id_class()) {
         var1.id_break(id_byte[13]);
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-128, -53, -72, -18, 111, -104, -114, 78}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_goto() {
      id_catch = new byte[]{2, 3, 2, 6, 2, 3, 4, 5, 6};
   }

   public boolean id_continue() {
      this.id_try();
      return this.aJ_() && ((rrIk_1)this.id_break[id_throws[15]]).id_class() ? id_byte[16] : id_byte[17];
   }

   public boolean id_else() {
      this.id_try();
      return this.aJ_() && ((rrIk_1)this.id_break[id_throws[14]]).id_class() ? id_byte[14] : id_byte[15];
   }

   private static void id_instanceof() {
      id_protected = new String[]{
         new String("Auto Sprint"),
         new String("Автоматически включает спринт"),
         new String("Голод"),
         new String("Слепоту"),
         new String("Приседание"),
         new String("Ползание"),
         new String("Использование предметов"),
         new String("Горизонтальную коллизию"),
         new String("Авто. конфигурации"),
         new String("SpookyTime"),
         new String("Funtime"),
         new String("Grim"),
         new String("Игнорировать")
      };
   }

   public boolean id_new() {
      this.id_try();
      return this.aJ_() && ((rrIk_1)this.id_break[id_throws[16]]).id_class() ? id_byte[18] : id_byte[19];
   }

   private static void id_return() {
      id_throws = new short[]{1, 0, 1, 2, 3, 4, 5, 0, 1, 2, 3, 4, 5, 5, 0, 1, 4, 2, 3, 0, 1, 2, 3, 4, 5, 0, 1, 2, 3, 4, 5, 0, 1, 2, 3, 4, 5};
   }

   public boolean id_super() {
      this.id_try();
      return this.aJ_() && ((rrIk_1)this.id_break[id_throws[18]]).id_class() ? id_byte[22] : id_byte[23];
   }

   private void id_try() {
      if (this.id_break == null) {
         this.id_break = new Object[6];
      }
   }

   private static void id_while() {
      id_byte = new boolean[]{
         false,
         true,
         true,
         true,
         true,
         true,
         false,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         true
      };
   }
}
