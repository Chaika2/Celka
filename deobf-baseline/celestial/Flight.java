package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Flight extends Module implements rrnZ_2 {
   private static boolean[] id_byte;
   private static String[] id_protected;
   public Object[] id_break;
   private static short[] id_throws;
   private static float[] id_catch;
   private static byte[] id_private;

   public Flight() {
      super(id_protected[0], id_protected[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_throws[0]]);
      this.id_throw();
      String var10003 = id_protected[2];
      String var10004 = id_protected[3];
      String[] var10005 = new String[id_private[0]];
      var10005[id_byte[0]] = id_protected[4];
      var10005[id_byte[1]] = id_protected[5];
      var10005[id_private[1]] = id_protected[6];
      rrIQ var5 = new rrIQ(var10003, var10004, var10005);
      this.id_break[id_throws[1]] = var5;
      rrIm_1 var6 = new rrIm_1(id_protected[7], id_catch[0], id_catch[1], id_catch[2], id_catch[3]).id_class(() -> {
         this.id_throw();
         return this.id_new() == (rrCD)this.id_break[id_throws[26]] ? id_byte[9] : id_byte[10];
      });
      this.id_break[id_throws[2]] = var6;
      rrIm_1 var7 = new rrIm_1(id_protected[8], id_catch[4], id_catch[5], id_catch[6], id_catch[7]).id_class(() -> {
         this.id_throw();
         return this.id_new() == (rrCK)this.id_break[id_throws[25]] ? id_byte[7] : id_byte[8];
      });
      this.id_break[id_throws[3]] = var7;
      rrCD var8 = new rrCD(this);
      this.id_break[id_throws[4]] = var8;
      rrCK var9 = new rrCK(this);
      this.id_break[id_throws[5]] = var9;
      rrCo_1 var10 = new rrCo_1(this);
      this.id_break[id_throws[6]] = var10;
      Setting[] var10001 = new Setting[id_private[2]];
      var10001[id_byte[2]] = (rrIQ)this.id_break[id_throws[7]];
      var10001[id_byte[3]] = (rrIm_1)this.id_break[id_throws[8]];
      var10001[id_private[3]] = (rrIm_1)this.id_break[id_throws[9]];
      this.id_class(var10001);
      rrCD var11 = (rrCD)this.id_break[id_throws[10]];
      this.id_break[id_throws[11]] = var11;
      ((rrIQ)this.id_break[id_throws[12]]).id_class(id_protected[9], (var1, var2) -> {
         this.id_throw();
         if ((rrTF)this.id_break[id_throws[17]] != null && this.aJ_()) {
            ((rrTF)this.id_break[id_throws[18]]).aK_();
         }

         String var3 = (String)var2.getLeft();
         byte var4 = id_private[4];
         switch (var3.hashCode()) {
            case -1017640528:
               if (var3.equals(id_protected[11])) {
                  var4 = id_byte[6];
               }
               break;
            case 2320462:
               if (var3.equals(id_protected[12])) {
                  var4 = id_private[5];
               }
               break;
            case 1897755483:
               if (var3.equals(id_protected[10])) {
                  var4 = id_byte[5];
               }
         }
         Object var9x = switch (var4) {
            case 0 -> (rrCD)this.id_break[id_throws[19]];
            case 1 -> (rrCK)this.id_break[id_throws[20]];
            case 2 -> (rrCo_1)this.id_break[id_throws[21]];
            default -> null;
         };
         this.id_break[id_throws[22]] = var9x;
         if ((rrTF)this.id_break[id_throws[23]] != null && this.aJ_()) {
            ((rrTF)this.id_break[id_throws[24]]).aI_();
         }
      });
   }

   static {
      ntfClinit();
   }

   public rrIm_1 id_this() {
      this.id_throw();
      return (rrIm_1)this.id_break[id_throws[15]];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -879094649;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4720540146179947115L;
   }

   @Override
   public void id_class(boolean var1) {
      super.id_class(var1);
      this.id_new().aI_();
   }

   @Override
   public void id_class() {
      this.id_byte(id_byte[4]);
      this.id_new().id_super();
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-103, 85, 25, -60, -55, 3, 50, -38}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_throws(boolean var1) {
      super.id_throws(var1);
      this.id_new().aK_();
   }

   private static void id_goto() {
      id_catch = new float[]{2.0F, 0.5F, 10.0F, 0.1F, 1.0F, 0.6F, 5.0F, 0.1F};
   }

   public rrIQ id_continue() {
      this.id_throw();
      return (rrIQ)this.id_break[id_throws[14]];
   }

   private static void id_else() {
      id_protected = new String[]{
         new String("Flight"),
         new String("Позволяет летать без креатив\nрежима"),
         new String("Режим"),
         new String("Vanilla"),
         new String("Vanilla"),
         new String("Levitation Boost"),
         new String("Jump"),
         new String("Скорость"),
         new String("Скорость"),
         new String("change_mode"),
         new String("Vanilla"),
         new String("Levitation Boost"),
         new String("Jump")
      };
   }

   private static void id_instanceof() {
      id_throws = new short[]{1, 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 0, 1, 0, 1, 2, 3, 0, 0, 4, 5, 6, 0, 0, 0, 5, 4};
   }

   public rrTF<Flight> id_new() {
      this.id_throw();
      return (rrTF<Flight>)this.id_break[id_throws[13]];
   }

   public rrIm_1 id_super() {
      this.id_throw();
      return (rrIm_1)this.id_break[id_throws[16]];
   }

   private void id_throw() {
      if (this.id_break == null) {
         this.id_break = new Object[7];
      }
   }

   private static void id_try() {
      id_private = new byte[]{3, 2, 3, 2, -1, 2, 7};
   }

   private static void id_while() {
      id_byte = new boolean[]{false, true, false, true, false, false, true, true, false, true, false};
   }
}
