package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AutoGApple extends Module {
   private static String[] id_byte;
   private static float[] id_protected;
   private static short[] id_throws;
   private static byte[] id_catch;
   private static boolean[] id_private;
   public Object[] id_break;

   public AutoGApple() {
      super(id_byte[0], id_byte[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_throws[0]]);
      this.id_new();
      rrIm_1 var5 = new rrIm_1(id_byte[2], 15.0F, 5.0F, 20.0F, 0.5F);
      this.id_break[2] = var5;
      this.id_class((rrIm_1)this.id_break[2]);
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_protected = new float[]{15.0F, 5.0F, 20.0F, 0.5F};
   }

   @EventTarget
   public void id_class(rrAm_1 var1) {
      this.id_new();
      if ((Boolean)this.id_break[id_throws[18]] || (Boolean)this.id_break[1]) {
         var1.id_class(true);
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 343223658;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4834134824521969145L;
   }

   @EventTarget
   public void id_class(rrAR var1) {
      this.id_new();
      if ((Boolean)this.id_break[id_throws[17]]) {
         var1.id_class(true);
      }
   }

   @EventTarget
   public void id_class(rrAC var1) {
      this.id_new();
      if (var1.id_break() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_throws[15]] && (Boolean)this.id_break[id_throws[16]]) {
         var1.id_class(true);
      }
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_new();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_throws[3]]) {
         Boolean var6 = id_private[0];
         this.id_break[1] = var6;
         if (((cb_3)id_import.id_class[57]).Ss() <= ((rrIm_1)this.id_break[2]).id_byte()) {
            rpD_2 var10000 = ((cb_3)id_import.id_class[57]).sK();
            rdb_3[] var10001 = new rdb_3[2];
            var10001[id_private[1]] = rdy_3.hy;
            var10001[1] = rdy_3.hp;
            if (!var10000.id_class(var10001)) {
               cb_3 var10 = (cb_3)id_import.id_class[57];
               var10001 = new rdb_3[2];
               var10001[id_private[3]] = rdy_3.hy;
               var10001[1] = rdy_3.hp;
               if (rrfH_2.id_class(var10, var10001) != null) {
                  ((Qw_1)id_import.id_class[20]).u.id_class(true);
                  Boolean var7 = true;
                  this.id_break[id_throws[10]] = var7;
                  return;
               }
            }
         }

         if ((Boolean)this.id_break[id_throws[11]]) {
            ((Qw_1)id_import.id_class[20]).u.id_class(id_private[7]);
            Boolean var8 = id_private[8];
            this.id_break[id_throws[13]] = var8;
            Boolean var9 = true;
            this.id_break[1] = var9;
         }
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{121, 61, 73, 7, 63, 56, -2, -4}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_throws(boolean var1) {
      this.id_new();
      super.id_throws(var1);
      Boolean var6 = id_private[13];
      this.id_break[1] = var6;
      if ((Boolean)this.id_break[id_throws[21]]) {
         if (((Qw_1)id_import.id_class[20]).u.id_protected()) {
            ((Qw_1)id_import.id_class[20]).u.id_class(id_private[14]);
         }

         Boolean var7 = id_private[15];
         this.id_break[id_throws[24]] = var7;
      }
   }

   private static void id_continue() {
      id_byte = new String[]{new String("Auto GApple"), new String("Автоматически ест золотое яблоко\nпри определённом здоровье"), new String("Здоровье")};
   }

   private static void id_else() {
      id_catch = new byte[]{2, 2, 3};
   }

   private void id_new() {
      if (this.id_break == null) {
         this.id_break = new Object[3];
         this.id_break[0] = false;
         this.id_break[1] = false;
      }
   }

   private static void id_return() {
      id_throws = new short[]{0, 2, 2, 0, 1, 57, 2, 57, 57, 20, 0, 0, 20, 0, 1, 0, 0, 0, 0, 1, 1, 0, 20, 20, 0};
   }

   private static void id_super() {
      id_private = new boolean[]{
         false, false, true, false, true, true, true, false, false, true, true, true, true, false, false, false, false, false, true, false
      };
   }
}
