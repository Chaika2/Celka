package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GY extends bq_3 implements rv_3 {
   private static double[] id_throws;
   public Object[] id_break;
   private static byte[] id_catch;
   private static short[] id_private;
   private static boolean[] id_implements;

   @Override
   public boolean id_byte() {
      this.id_int();
      if ((Predicate)this.id_break[0] == null) {
         return false;
      } else {
         this.id_final();
         return !((List)this.id_break[1]).isEmpty() ? true : id_implements[6];
      }
   }

   private void id_int() {
      if (this.id_break == null) {
         this.id_break = new Object[3];
         Object[] var1 = this.id_break;
         var1[2] = false;
      }
   }

   public GY(C_class var1) {
      super(var1);
      this.id_int();
   }

   static {
      ntfClinit();
   }

   private boolean id_class(an_3 var1) {
      if (var1 == null) {
         return false;
      } else if (!var1.BM()) {
         return false;
      } else if (var1.equals(((Ps_1)this.id_case[1]).id_catch())) {
         return false;
      } else {
         int var2 = (Integer)C_class.id_instanceof().id_interface.id_class[0];
         return var2 != 0 && var1.id_int(((Ps_1)this.id_case[1]).id_catch()) > (double)(var2 * var2)
            ? false
            : ((Ps_1)this.id_case[1]).id_implements().anyMatch(var1::equals);
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{3, -30, 49, -31, -7, -5, -74, 12}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public String id_class() {
      this.id_int();
      return "Following " + (List)this.id_break[1];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1705320050;
   }

   @Override
   public void id_class(Predicate<rdn_3> var1) {
      this.id_int();
      Predicate var6 = var1x -> {
         if (var1x instanceof rsE_2 var2 && var1.test(var2.id_protected())) {
            return true;
         }

         return id_implements[10];
      };
      this.id_break[0] = var6;
      Boolean var7 = true;
      this.id_break[2] = var7;
   }

   @Override
   public rn_3 id_class(boolean var1, boolean var2) {
      this.id_int();
      this.id_final();
      rs_3 var3 = new rs_3(((List)this.id_break[1]).stream().map(this::id_break).toArray(rP_2[]::new));
      return new rn_3(var3, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[3]);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7993086142113992714L;
   }

   private rP_2 id_break(an_3 var1) {
      this.id_int();
      Object var2;
      if ((Double)C_class.id_instanceof().id_while.id_class[0] != 0.0 && !(Boolean)this.id_break[2]) {
         rX_2 var3 = rX_2.id_class(var1.Ps(), (Float)C_class.id_instanceof().PE.id_class[0], (Double)C_class.id_instanceof().id_while.id_class[0]);
         var2 = new rU_2((double)var3.id_byte(), var1.Ps().id_byte, (double)var3.id_break());
      } else {
         var2 = var1.Bs();
      }

      return (rP_2)(this.id_break[2] ? new rS_2((rfH_2)var2) : new rb_3((rfH_2)var2, (Integer)C_class.id_instanceof().T.id_class[0]));
   }

   @Override
   public void id_break(Predicate<an_3> var1) {
      this.id_int();
      this.id_break[0] = var1;
      Boolean var7 = false;
      this.id_break[2] = var7;
   }

   @Override
   public Predicate<an_3> id_finally() {
      this.id_int();
      return (Predicate<an_3>)this.id_break[0];
   }

   private static void id_extends() {
      id_implements = new boolean[]{false, false, false, false, false, true, false, false, true, true, false, false};
   }

   @Override
   public List<an_3> id_implements() {
      this.id_int();
      return (List<an_3>)this.id_break[1];
   }

   private static void id_package() {
      id_private = new short[]{1, 3, 0, 2, 0, 0, 2, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 2, 0, 2, 1, 0};
   }

   @Override
   public void id_protected() {
      this.id_int();
      super.id_protected();
      Object var5 = null;
      this.id_break[0] = var5;
      Object var6 = null;
      this.id_break[1] = var6;
   }

   private void id_final() {
      this.id_int();
      List var5 = ((Ps_1)this.id_case[1])
         .id_implements()
         .filter(this::id_class)
         .filter((Predicate<? super an_3>)this.id_break[0])
         .distinct()
         .collect(Collectors.toList());
      this.id_break[1] = var5;
   }

   private static void id_volatile() {
      id_catch = new byte[]{3, 2};
   }

   private static void id_native() {
      id_throws = new double[1];
   }
}
