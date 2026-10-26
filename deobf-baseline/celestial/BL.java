package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BL extends Pv_1 {
   private static boolean[] id_break;
   private static byte[] id_byte;
   private static String[] id_protected;
   private static short[] id_throws;

   private static void id_byte() {
      id_throws = new short[]{0, 1, 1, 0, 2, 0, 2, 0, 1, 1, 0};
   }

   public BL(C_class var1) {
      super(var1);
   }

   static {
      ntfClinit();
   }

   private static void id_class() {
      id_break = new boolean[]{false, true, true, false};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2132120571;
   }

   @Override
   public void id_class(A var1) {
      if ((Boolean)C_class.id_instanceof().Pd.id_class[id_throws[0]]) {
         if (var1.id_class() == (n_1)n_1.staticFieldse7df95b1dfb038edb75e6ac1f750d600[id_throws[1]]) {
            rU_2 var2 = rU_2.id_class(var1.id_break());
            xc_3 var3 = bw_3.id_class((Ps_1)this.id_class[id_throws[2]], var2);
            if (var3.id_break() instanceof xb_3) {
               if (var3.id_byte(xb_3.id_volatile) == rCp_1.FOOT) {
                  var2 = var2.id_class(var3.id_byte(xb_3.p));
               }

               Set var4 = ((C_class)this.id_class[id_throws[3]])
                  .id_strictfp()
                  .id_byte()
                  .id_class()
                  .id_break((C_else)C_else.staticFieldsbc7116b836d43454b9c0677570bd159e[id_throws[4]]);
               boolean var5 = var4.stream().map(C_this::id_class).filter(var2::equals).findFirst().isPresent();
               if (!var5) {
                  ((C_class)this.id_class[id_throws[5]])
                     .id_strictfp()
                     .id_byte()
                     .id_class()
                     .id_class(new C_while(id_protected[0], (C_else)C_else.staticFieldsbc7116b836d43454b9c0677570bd159e[id_throws[6]], var2));
               }
            }
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 9213059358347374721L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-70, 56, -85, -102, 17, 106, -114, 77}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_protected = new String[]{
         new String("bed"),
         new String("death"),
         new String("Death position saved."),
         new String("Click to goto death"),
         new String("%s%s goto %s @ %d"),
         new String("wp")
      };
   }

   private static void id_protected() {
      id_byte = new byte[]{4, 2, 3};
   }

   @Override
   public void id_volatile() {
      if ((Boolean)C_class.id_instanceof().y.id_class[id_throws[7]]) {
         C_while var1 = new C_while(
            id_protected[1], (C_else)C_else.staticFieldsbc7116b836d43454b9c0677570bd159e[id_throws[8]], ((Ps_1)this.id_class[id_throws[9]]).id_volatile()
         );
         ((C_class)this.id_class[id_throws[10]]).id_strictfp().id_byte().id_class().id_class(var1);
         rVe_1 var2 = new rVe_1(id_protected[2]);
         rgc_3 var10001 = var2.id_class().id_class(rgF_2.WHITE).id_class(new rgy_3(rgp_3.id_class, new rgN_2(id_protected[3])));
         rgH_2 var10004 = rgH_2.RUN_COMMAND;
         String var10005 = id_protected[4];
         Object[] var10006 = new Object[id_byte[0]];
         var10006[id_break[0]] = C_throw.id_class;
         var10006[id_break[1]] = id_protected[5];
         var10006[id_byte[1]] = var1.id_break().id_class();
         var10006[id_byte[2]] = var1.id_protected();
         var2.id_class(var10001.id_class(new rgl_3(var10004, String.format(var10005, var10006))));
         PP var10000 = PP.a_;
         rVi_1[] var3 = new rVi_1[id_break[2]];
         var3[id_break[3]] = var2;
         var10000.id_class(var3);
      }
   }
}
