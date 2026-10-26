package celestial;

import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Pa_1 extends Pv_1 implements PP {
   private static boolean[] id_throws;
   public Object[] id_break;
   private static byte[] id_case;
   private static short[] id_catch;

   private static void id_byte() {
      id_catch = new short[]{0, 0, 0, 74, 74, 0, 74, 74, 74, 0, 64, 0, 0, 0};
   }

   public Pa_1(C_class var1) {
      super(var1);
      this.id_throws();
      HashSet var6 = new HashSet();
      this.id_break[id_catch[0]] = var6;
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(rrFK var1) {
      this.id_throws();
      ((Set)this.id_break[id_catch[12]]).clear();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3465471855421415170L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -37821508;
   }

   @Override
   public void id_class(q_1 var1) {
      this.id_throws();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_catch[1]]) {
         Iterator var2 = ((Set)this.id_break[id_catch[2]]).iterator();

         while (var2.hasNext()) {
            Pi_1 var3 = (Pi_1)var2.next();
            iB_2 var4 = var3.id_break();
            rjG_2 var5 = var3.id_class();
            Integer var10 = (Integer)var4.id_private[74] + 1;
            var4.id_private[74] = var10;
            if (!var4.Pu()) {
               ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_catch[5]]).id_finally().id_class(rrnx_3.id_class(var4, var5));
               var2.remove();
            } else if ((Integer)var4.id_private[74] > 5) {
               var2.remove();
               Integer var11 = Integer.valueOf(id_throws[1]);
               var4.id_private[74] = var11;
            }
         }
      }
   }

   public Set<Pi_1> id_class() {
      this.id_throws();
      return (Set<Pi_1>)this.id_break[id_catch[13]];
   }

   @Override
   public void id_class(rrFj_1 var1) {
      this.id_throws();
      if (var1.id_class() instanceof iB_2 var3) {
         Integer var8 = Integer.valueOf(id_throws[2]);
         var3.id_private[74] = var8;
         ((Set)this.id_break[id_catch[9]]).add(new Pi_1(var3, (rjG_2)b_.id_class[64]));
      }
   }

   @Override
   public void id_class(rrAQ var1) {
      this.id_throws();
      ((Set)this.id_break[id_catch[11]]).removeIf(var1x -> var1x.id_break().equals(var1.id_class()));
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{23, 93, 42, -107, 90, 77, -60, 69}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_case = new byte[]{5};
   }

   private void id_throws() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
         Object[] var1 = this.id_break;
      }
   }

   private static void id_protected() {
      id_throws = new boolean[]{true, false, false, true};
   }
}
