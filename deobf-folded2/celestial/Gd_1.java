package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Gd_1 extends bq_3 {
   public Object[] id_break;
   private static boolean[] id_throws;
   private static String[] id_catch;
   private static double[] id_private;
   private static short[] id_implements;

   @Override
   public boolean id_byte() {
      this.id_native();
      if (((Ps_1)this.id_case[1]).id_catch() != null && ((Ps_1)this.id_case[1]).id_case() != null) {
         if (!(Boolean)C_class.id_instanceof().B.id_class[0]) {
            return false;
         } else if ((Boolean)C_class.id_instanceof().id_double.id_class[0]) {
            this.id_case("Backfill cannot be used with allowParkour true");
            C_extends var10000 = C_class.id_instanceof().B;
            Boolean var7 = false;
            var10000.id_class[0] = var7;
            return false;
         } else {
            for (rfH_2 var2 : new ArrayList(((HashMap)this.id_break[0]).keySet())) {
               if (((Ps_1)this.id_case[1]).id_case().id_volatile(var2) instanceof ron_3
                  || ((Ps_1)this.id_case[1]).id_case().id_byte(var2).id_break() != xu_3.id_class) {
                  ((HashMap)this.id_break[0]).remove(var2);
               }
            }

            this.id_volatile();
            ((C_class)this.id_case[0]).id_int().id_class();
            return !this.id_private().isEmpty() ? true : id_throws[5];
         }
      } else {
         return id_throws[0];
      }
   }

   public Gd_1(C_class var1) {
      super(var1);
      this.id_native();
      HashMap var6 = new HashMap();
      this.id_break[0] = var6;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -718363754166185546L;
   }

   @Override
   public rn_3 id_class(boolean var1, boolean var2) {
      if (!var2) {
         return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[1]);
      } else {
         ((C_class)this.id_case[0]).id_int().id_class();

         for (rfH_2 var4 : this.id_private()) {
            EA var5 = new EA();
            switch (((int[])Gk_1.id_class[0])[EF.id_class(var5, (C_class)this.id_case[0], var4, false, false).ordinal()]) {
               case 1:
                  break;
               case 2:
                  ((C_class)this.id_case[0]).id_int().id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[5], true);
                  return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[1]);
               case 3:
                  ((C_class)this.id_case[0]).id_private().id_class(var5.id_class().id_break().get(), true);
                  return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[1]);
               default:
                  throw new IllegalStateException();
            }
         }

         return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[5]);
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-64, 35, -79, 24, 121, -112, 117, 108}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private boolean id_class(rfH_2 var1) {
      Gh_1 var2 = ((C_class)this.id_case[0]).id_while().id_new();
      if (var2 != null && !var2.id_protected() && !var2.id_private()) {
         Ev_1 var3 = (Ev_1)var2.id_class().id_catch().get(var2.id_break());
         return Arrays.asList(var3.id_finally()).contains(var1);
      } else {
         return id_throws[10];
      }
   }

   @Override
   public String id_class() {
      return "Backfill";
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 847841638;
   }

   private static void id_finally() {
      id_catch = new String[]{new String("Backfill cannot be used with allowParkour true"), new String("Backfill")};
   }

   @Override
   public boolean id_catch() {
      return true;
   }

   private static void id_extends() {
      id_throws = new boolean[]{false, false, false, false, true, false, false, false, true, true, false, true, true, false, true, false, true};
   }

   @Override
   public double id_case() {
      return 5.0;
   }

   private static void id_implements() {
      id_private = new double[]{5.0};
   }

   @Override
   public void id_protected() {
      this.id_native();
      super.id_protected();
      if ((HashMap)this.id_break[0] != null && !((HashMap)this.id_break[0]).isEmpty()) {
         ((HashMap)this.id_break[0]).clear();
      }
   }

   public List<rfH_2> id_private() {
      this.id_native();
      return ((HashMap)this.id_break[0])
         .keySet()
         .stream()
         .filter(var1 -> ((Ps_1)this.id_case[1]).id_case().id_byte(var1).id_break() == xu_3.id_class ? true : id_throws[15])
         .filter(var1 -> ((C_class)this.id_case[0]).b().id_class(var1, xu_3.id_finally.id_continue()))
         .filter(var1 -> !this.id_class(var1) ? true : id_throws[13])
         .sorted(Comparator.comparingDouble(((Ps_1)this.id_case[1]).id_volatile()::id_private).reversed())
         .collect(Collectors.toList());
   }

   private static void id_final() {
      id_implements = new short[]{0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 5, 1, 0, 1, 5, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1};
   }

   private void id_volatile() {
      this.id_native();
      if (((Ps_1)this.id_case[1]).id_class().isPresent() && ((C_class)this.id_case[0]).id_while().id_catch()) {
         ((HashMap)this.id_break[0])
            .put(((Ps_1)this.id_case[1]).id_class().get(), ((Ps_1)this.id_case[1]).id_case().id_byte(((Ps_1)this.id_case[1]).id_class().get()));
      }
   }

   private void id_native() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
         Object[] var1 = this.id_break;
      }
   }
}
