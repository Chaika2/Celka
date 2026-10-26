package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Bb_1 extends Pv_1 {
   private static short[] id_byte;
   private static boolean[] id_protected;
   public Object[] id_break;
   private static String[] id_throws;

   private static void id_byte() {
      id_protected = new boolean[]{false, true, true, true, true, false, true, false, false};
   }

   public Bb_1(C_class var1) {
      super(var1);
      this.id_case();
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1750887501455729896L;
   }

   @Override
   public void id_class(rrFK var1) {
      this.id_class(false);
   }

   public void id_class(boolean var1) {
      this.id_case();
      if (var1 != (Boolean)this.id_break[0]) {
         Boolean var7 = var1;
         this.id_break[0] = var7;
         rrFw_1 var2 = rrFw_1.id_class(
            this.id_break[0] ? (rrFI)rrFI.staticFields7eee503931553d5586d91adc0f9df349[0] : (rrFI)rrFI.staticFields7eee503931553d5586d91adc0f9df349[1]
         );
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(var2);
         ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_class(var2);
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1651729777;
   }

   @Override
   public void id_class(q_1 var1) {
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         this.id_class(this.id_protected());
      }
   }

   public boolean id_class() {
      this.id_case();
      return (Boolean)this.id_break[0];
   }

   private static void id_break() {
      id_byte = new short[]{0, 0, 0, 0, 0, 1, 0, 0, 1, 19, 19, 19, 1, 2, 0};
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-103, -76, -124, 113, 5, 17, 6, -94}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_throws = new String[]{
         new String("pvp"),
         new String("обычная дуэль"),
         new String("личная дуэль"),
         new String("командная дуэль"),
         new String("рейтинговая дуэль"),
         new String("pvp"),
         new String("окончено")
      };
   }

   private void id_case() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
         Object[] var1 = this.id_break;
         var1[0] = false;
      }
   }

   private boolean id_protected() {
      QY var1 = ((Ps_1)this.id_class[1]).id_throws();
      uj_3 var2 = ((cq_3)var1.id_class[19]).id_extends();
      rgP_2 var3 = ((cq_3)var1.id_class[19]).id_final();
      int var4 = ((cq_3)var1.id_class[19]).id_package();
      if (var2.id_class("pvp")) {
         return true;
      } else if ((rrfq_3)rrfp_3.id_class[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]
         || !var2.id_class("обычная дуэль") && !var2.id_class("личная дуэль") && !var2.id_class("командная дуэль") && !var2.id_class("рейтинговая дуэль")) {
         if (rrjS_2.id_protected()) {
            return true;
         } else {
            if (var3 != null && var4 > 0) {
               String var5 = var3.getString().toLowerCase();
               if (var5.contains("pvp") && !var5.contains("окончено")) {
                  return true;
               }
            }

            return id_protected[5];
         }
      } else {
         return id_protected[2];
      }
   }
}
