package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class XRay<T extends rrqN_2> extends Module implements rrqd_3 {
   private static String[] id_byte;
   private static float[] id_protected;
   private static boolean[] id_throws;
   public Object[] id_break;
   private static short[] id_catch;
   private static byte[] id_private;

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{91, 93, 78, 26, -94, 25, -19, 32}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public XRay() {
      super(id_byte[0], id_byte[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_catch[0]]);
      this.id_goto();
      String var10003 = id_byte[2];
      String var10004 = id_byte[3];
      String[] var10005 = new String[id_private[0]];
      var10005[id_throws[0]] = id_byte[4];
      var10005[id_throws[1]] = id_byte[5];
      rrIQ var5 = new rrIQ(var10003, var10004, var10005);
      this.id_break[id_catch[1]] = var5;
      rrIm_1 var6 = new rrIm_1(id_byte[6], id_protected[0], id_protected[1], id_protected[2], id_protected[3]);
      this.id_break[id_catch[2]] = var6;
      rrIm_1 var7 = new rrIm_1(id_byte[7], id_protected[4], id_protected[5], id_protected[6], id_protected[7]);
      this.id_break[id_catch[3]] = var7;
      Boolean var8 = id_throws[2];
      this.id_break[id_catch[4]] = var8;
      rrqm_3 var9 = new rrqm_3(this);
      this.id_break[id_catch[5]] = var9;
      rrqZ_2 var10 = new rrqZ_2(this);
      this.id_break[id_catch[6]] = var10;
      rrqm_3 var11 = (rrqm_3)this.id_break[id_catch[7]];
      this.id_break[id_catch[8]] = var11;
      ((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[id_catch[9]]).id_break(this);
      ((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[id_catch[10]]).id_break((rrqN_2)this.id_break[id_catch[11]]);
      ((rrIQ)this.id_break[id_catch[12]]).id_class(id_byte[8], (var1, var2) -> {
         this.id_goto();
         if ((rrqN_2)this.id_break[id_catch[32]] != null && this.aJ_()) {
            ((rrqN_2)this.id_break[id_catch[33]]).aK_();
         }

         ((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[id_catch[34]]).id_class((rrqN_2)this.id_break[id_catch[35]]);
         String var3 = (String)var2.getLeft();
         byte var4 = id_private[3];
         switch (var3.hashCode()) {
            case -1085510111:
               if (var3.equals(id_byte[9])) {
                  var4 = id_throws[9];
               }
               break;
            case 802060952:
               if (var3.equals(id_byte[10])) {
                  var4 = id_throws[10];
               }
         }
         Object var9x = switch (var4) {
            case 0 -> (rrqm_3)this.id_break[id_catch[36]];
            case 1 -> (rrqZ_2)this.id_break[id_catch[37]];
            default -> null;
         };
         this.id_break[id_catch[38]] = var9x;
         if ((rrqN_2)this.id_break[id_catch[39]] != null && this.aJ_()) {
            ((rrqN_2)this.id_break[id_catch[40]]).aI_();
         }

         ((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[id_catch[41]]).id_break((rrqN_2)this.id_break[id_catch[42]]);
      });
      ((rrIm_1)this.id_break[id_catch[13]]).id_class(() -> {
         this.id_goto();
         return (rrqN_2)this.id_break[id_catch[30]] == (rrqm_3)this.id_break[id_catch[31]] ? id_throws[7] : id_throws[8];
      });
      ((rrIm_1)this.id_break[id_catch[14]]).id_class(() -> {
         this.id_goto();
         return (rrqN_2)this.id_break[id_catch[28]] == (rrqm_3)this.id_break[id_catch[29]] ? id_throws[5] : id_throws[6];
      });
      Setting[] var10001 = new Setting[id_private[1]];
      var10001[id_throws[3]] = (rrIQ)this.id_break[id_catch[15]];
      var10001[id_throws[4]] = (rrIm_1)this.id_break[id_catch[16]];
      var10001[id_private[2]] = (rrIm_1)this.id_break[id_catch[17]];
      this.id_class(var10001);
   }

   static {
      ntfClinit();
   }

   public rrIQ id_this() {
      this.id_goto();
      return (rrIQ)this.id_break[id_catch[23]];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 927402356696512671L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -424416841;
   }

   @Override
   public void id_class(boolean var1) {
      this.id_goto();
      if (((rrqN_2)this.id_break[id_catch[18]]).aI_()) {
         super.id_class(var1);
      }
   }

   @Override
   public void id_throws(boolean var1) {
      this.id_goto();
      super.id_throws(var1);
      ((rrqN_2)this.id_break[id_catch[19]]).aK_();
   }

   private void id_goto() {
      if (this.id_break == null) {
         this.id_break = new Object[7];
         this.id_break[6] = false;
      }
   }

   public void id_case(boolean var1) {
      this.id_goto();
      Boolean var6 = var1;
      this.id_break[id_catch[27]] = var6;
   }

   public boolean id_continue() {
      this.id_goto();
      return (Boolean)this.id_break[id_catch[26]];
   }

   public rrIm_1 id_else() {
      this.id_goto();
      return (rrIm_1)this.id_break[id_catch[24]];
   }

   private static void id_instanceof() {
      id_protected = new float[]{16.0F, 6.0F, 64.0F, 1.0F, 20.0F, 1.0F, 30.0F, 1.0F};
   }

   public rrIm_1 id_new() {
      this.id_goto();
      return (rrIm_1)this.id_break[id_catch[25]];
   }

   public rrqZ_2 id_return() {
      this.id_goto();
      return (rrqZ_2)this.id_break[id_catch[21]];
   }

   public T id_super() {
      this.id_goto();
      return (T)this.id_break[id_catch[22]];
   }

   private static void id_throw() {
      id_private = new byte[]{2, 3, 2, -1, 7, 6};
   }

   private static void id_try() {
      id_byte = new String[]{
         new String("X-Ray"),
         new String("WallHack на блоки для серверов с\nсильным античитом"),
         new String("Режим"),
         new String("Default"),
         new String("Default"),
         new String("Ancient"),
         new String("Радиус сканирования"),
         new String("Скорость сканирования"),
         new String("change_mode"),
         new String("Default"),
         new String("Ancient")
      };
   }

   private static void id_while() {
      id_catch = new short[]{4, 3, 4, 5, 6, 0, 1, 0, 2, 0, 0, 2, 3, 4, 5, 3, 4, 5, 2, 2, 0, 1, 2, 3, 4, 5, 6, 6, 2, 0, 2, 0, 2, 2, 0, 2, 0, 1, 2, 2, 2, 0, 2};
   }

   public rrqm_3 id_public() {
      this.id_goto();
      return (rrqm_3)this.id_break[id_catch[20]];
   }

   private static void id_abstract() {
      id_throws = new boolean[]{false, true, true, false, true, true, false, true, false, false, true, false};
   }
}
