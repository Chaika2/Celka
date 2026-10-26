package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Spider extends Module implements rrnZ_2 {
   private static byte[] id_byte;
   private static boolean[] id_protected;
   public Object[] id_break;
   private static short[] id_throws;
   private static String[] id_catch;

   public Spider() {
      super(id_catch[0], id_catch[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_throws[0]]);
      this.id_else();
      String var10003 = id_catch[2];
      String var10004 = id_catch[3];
      String[] var10005 = new String[id_byte[0]];
      var10005[id_protected[0]] = id_catch[4];
      var10005[id_protected[1]] = id_catch[5];
      var10005[id_byte[1]] = id_catch[6];
      rrIQ var5 = new rrIQ(var10003, var10004, var10005);
      this.id_break[id_throws[1]] = var5;
      Setting[] var10001 = new Setting[id_protected[2]];
      var10001[id_protected[3]] = (rrIQ)this.id_break[id_throws[2]];
      this.id_class(var10001);
      rrlM_2 var6 = new rrlM_2(this);
      this.id_break[id_throws[3]] = var6;
      rrlO_2 var7 = new rrlO_2(this);
      this.id_break[id_throws[4]] = var7;
      rrlb_3 var8 = new rrlb_3(this);
      this.id_break[id_throws[5]] = var8;
      rrlM_2 var9 = (rrlM_2)this.id_break[id_throws[6]];
      this.id_break[id_throws[7]] = var9;
      ((rrIQ)this.id_break[id_throws[8]]).id_class(id_catch[7], (var1, var2) -> {
         this.id_else();
         if ((rrTF)this.id_break[id_throws[11]] != null && this.aJ_()) {
            ((rrTF)this.id_break[id_throws[12]]).aK_();
         }

         String var3 = (String)var2.getLeft();
         byte var4 = id_byte[2];
         switch (var3.hashCode()) {
            case -1997372447:
               if (var3.equals(id_catch[9])) {
                  var4 = id_protected[6];
               }
               break;
            case 2228079:
               if (var3.equals(id_catch[8])) {
                  var4 = id_protected[5];
               }
               break;
            case 1155506348:
               if (var3.equals(id_catch[10])) {
                  var4 = id_byte[3];
               }
         }
         Object var9x = switch (var4) {
            case 0 -> (rrlM_2)this.id_break[id_throws[13]];
            case 1 -> (rrlO_2)this.id_break[id_throws[14]];
            case 2 -> (rrlb_3)this.id_break[id_throws[15]];
            default -> null;
         };
         this.id_break[id_throws[16]] = var9x;
         if ((rrTF)this.id_break[id_throws[17]] != null && this.aJ_()) {
            ((rrTF)this.id_break[id_throws[18]]).aI_();
         }
      });
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_protected = new boolean[]{false, true, true, false, false, false, true};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1091183455412216698L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 26088505;
   }

   @Override
   public void id_class() {
      this.id_protected(id_protected[4]);
      this.id_new().aK_();
   }

   @Override
   public void id_class(boolean var1) {
      if (this.id_new().aI_()) {
         super.id_class(var1);
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-56, -84, 104, 9, -62, 49, 113, -39}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_throws(boolean var1) {
      if (this.id_new().aK_()) {
         super.id_throws(var1);
      }
   }

   public rrlM_2 id_continue() {
      this.id_else();
      return (rrlM_2)this.id_break[id_throws[10]];
   }

   private void id_else() {
      if (this.id_break == null) {
         this.id_break = new Object[5];
      }
   }

   public rrTF<Spider> id_new() {
      this.id_else();
      return (rrTF<Spider>)this.id_break[id_throws[9]];
   }

   private static void id_return() {
      id_catch = new String[]{
         new String("Spider"),
         new String("Позволяет взбираться по стенам"),
         new String("Режим"),
         new String("Grim"),
         new String("Grim"),
         new String("Matrix"),
         new String("Funtime"),
         new String("change_mode"),
         new String("Grim"),
         new String("Matrix"),
         new String("Funtime")
      };
   }

   private static void id_super() {
      id_throws = new short[]{1, 1, 1, 2, 3, 4, 2, 0, 1, 0, 2, 0, 0, 2, 3, 4, 0, 0, 0};
   }

   private static void id_public() {
      id_byte = new byte[]{3, 2, -1, 2, 5};
   }
}
