package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ClickPearl extends Module {
   public Object[] id_break;
   private static boolean[] id_byte;
   private static byte[] id_protected;
   private static short[] id_throws;
   private static String[] id_catch;

   public ClickPearl() {
      super(id_catch[0], id_catch[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
      this.id_return();
      String var10003 = id_catch[2];
      String var10004 = id_catch[3];
      String[] var10005 = new String[2];
      var10005[id_byte[0]] = id_catch[4];
      var10005[1] = id_catch[5];
      rrIQ var5 = new rrIQ(var10003, var10004, var10005);
      this.id_break[id_throws[1]] = var5;
      rrIF var6 = new rrIF(id_catch[6], (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[3]);
      this.id_break[1] = var6;
      Setting[] var10001 = new Setting[2];
      var10001[id_byte[2]] = (rrIQ)this.id_break[id_throws[4]];
      var10001[1] = (rrIF)this.id_break[1];
      this.id_class(var10001);
      rryy_1 var7 = new rryy_1(this);
      this.id_break[3] = var7;
      rryC var8 = new rryC(this);
      this.id_break[4] = var8;
      rryy_1 var9 = (rryy_1)this.id_break[3];
      this.id_break[2] = var9;
      ((rrIQ)this.id_break[id_throws[10]]).id_class(id_catch[7], (var1, var2) -> {
         this.id_return();
         if ((rrTF)this.id_break[2] != null && this.aJ_()) {
            ((rrTF)this.id_break[2]).aK_();
         }

         String var3 = (String)var2.getLeft();
         byte var4 = -1;
         switch (var3.hashCode()) {
            case -495240450:
               if (var3.equals(id_catch[9])) {
                  var4 = 1;
               }
               break;
            case 1897755483:
               if (var3.equals(id_catch[8])) {
                  var4 = id_byte[4];
               }
         }
         Object var9x = switch (var4) {
            case 0 -> (rryy_1)this.id_break[3];
            case 1 -> (rryC)this.id_break[4];
            default -> null;
         };
         this.id_break[2] = var9x;
         if ((rrTF)this.id_break[2] != null && this.aJ_()) {
            ((rrTF)this.id_break[2]).aI_();
         }
      });
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_protected = new byte[]{2, 2, -1, 5};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6355278915295096084L;
   }

   @Override
   public void id_class(boolean var1) {
      this.id_return();
      super.id_class(var1);
      ((rrTF)this.id_break[2]).aI_();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1509486563;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{7, -75, 31, 3, -33, 39, -88, 7}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_throws(boolean var1) {
      this.id_return();
      super.id_throws(var1);
      ((rrTF)this.id_break[2]).aK_();
   }

   public rrIF id_continue() {
      this.id_return();
      return (rrIF)this.id_break[1];
   }

   private static void id_else() {
      id_byte = new boolean[]{false, true, false, true, false, true};
   }

   public rrTF<ClickPearl> id_new() {
      this.id_return();
      return (rrTF<ClickPearl>)this.id_break[2];
   }

   private void id_return() {
      if (this.id_break == null) {
         this.id_break = new Object[5];
      }
   }

   private static void id_super() {
      id_catch = new String[]{
         new String("Click Pearl"),
         new String("Бросает эндер-пёрл на клавишу"),
         new String("Режим"),
         new String("Vanilla"),
         new String("Vanilla"),
         new String("HolyWorld"),
         new String("Клавиша"),
         new String("change_mode"),
         new String("Vanilla"),
         new String("HolyWorld")
      };
   }

   private static void id_public() {
      id_throws = new short[]{4, 0, 3, 1, 0, 1, 3, 4, 3, 2, 0, 2, 2, 1, 2, 2, 2, 3, 4, 2, 2, 2};
   }
}
