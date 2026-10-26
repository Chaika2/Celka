package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrqY_2 implements MinecraftAccessor {
   ;
   public Object[] fields0d81573182c03565b5bb298419afe0b7;
   public static Object[] staticFields0d81573182c03565b5bb298419afe0b7;
   private static short[] shorts0d81573182c03565b5bb298419afe0b7;
   private static boolean[] booleans0d81573182c03565b5bb298419afe0b7;
   private static String[] strings0d81573182c03565b5bb298419afe0b7;
   private static byte[] bytes0d81573182c03565b5bb298419afe0b7;

   public rrqU_2 byte_(String var1) {
      return ((Set)this.fields0d81573182c03565b5bb298419afe0b7[0])
         .stream()
         .filter(var1x -> ri_3.class_(var1x.break_()).equalsIgnoreCase(ri_3.class_(ri_3.class_(var1))))
         .findFirst()
         .orElse(null);
   }

   public Set<rrqU_2> byte_() {
      return (Set<rrqU_2>)this.fields0d81573182c03565b5bb298419afe0b7[0];
   }

   private rrqY_2() {
      this.finally_();
      HashSet var7 = new HashSet();
      this.fields0d81573182c03565b5bb298419afe0b7[0] = var7;
      ArrayList var8 = new ArrayList();
      this.fields0d81573182c03565b5bb298419afe0b7[1] = var8;
      this.class_(new rrqa_3());
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -562886032547598555L;
   }

   public void class_(Consumer<rrqU_2> var1) {
      if (((Set)this.fields0d81573182c03565b5bb298419afe0b7[0]).isEmpty()) {
         ((List)this.fields0d81573182c03565b5bb298419afe0b7[1]).forEach(rrqe_3::class_);
      } else {
         ((Set)this.fields0d81573182c03565b5bb298419afe0b7[0]).forEach(var1);
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1127930620;
   }

   public boolean class_(String var1) {
      rrqU_2 var2 = this.byte_(var1);
      if (var2 == null) {
         ((List)this.fields0d81573182c03565b5bb298419afe0b7[1]).forEach(var1x -> var1x.e_(var1));
         return false;
      } else {
         boolean var3 = ((Set)this.fields0d81573182c03565b5bb298419afe0b7[0]).remove(var2);
         ((List)this.fields0d81573182c03565b5bb298419afe0b7[1]).forEach(var2x -> var2x.class_(var2, var3));
         if (var3) {
            ((yX_2)import_.class_[8]).throws_();
         }

         return var3;
      }
   }

   public void class_(rrqe_3 var1) {
      ((List)this.fields0d81573182c03565b5bb298419afe0b7[1]).add(var1);
   }

   public void class_(rrqU_2 var1, String var2, boolean var3) {
      if (var1.break_() == xu_3.class_) {
         ((List)this.fields0d81573182c03565b5bb298419afe0b7[1]).forEach(var1x -> var1x.class_(var2, new u_1("Block not found")));
      } else {
         boolean var4 = ((Set)this.fields0d81573182c03565b5bb298419afe0b7[0]).add(var1);
         if (var3) {
            ((List)this.fields0d81573182c03565b5bb298419afe0b7[1]).forEach(var2x -> var2x.break_(var1, var4));
         }

         if (var4) {
            ((yX_2)import_.class_[8]).throws_();
         }
      }
   }

   public List<rrqe_3> class_() {
      return (List<rrqe_3>)this.fields0d81573182c03565b5bb298419afe0b7[1];
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-72, 96, 110, -92, 35, 92, 45, -122}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void break_() {
      if (((Set)this.fields0d81573182c03565b5bb298419afe0b7[0]).isEmpty()) {
         ((List)this.fields0d81573182c03565b5bb298419afe0b7[1]).forEach(rrqe_3::class_);
      } else {
         ((Set)this.fields0d81573182c03565b5bb298419afe0b7[0]).clear();
         ((List)this.fields0d81573182c03565b5bb298419afe0b7[1]).forEach(rrqe_3::new_);
         ((yX_2)import_.class_[8]).throws_();
      }
   }

   private static void throws_() {
      bytes0d81573182c03565b5bb298419afe0b7 = new byte[]{2, 2};
   }

   private void finally_() {
      if (this.fields0d81573182c03565b5bb298419afe0b7 == null) {
         this.fields0d81573182c03565b5bb298419afe0b7 = new Object[2];
      }
   }

   private static void catch_() {
      shorts0d81573182c03565b5bb298419afe0b7 = new short[]{1, 0, 1, 1, 0, 1, 8, 1, 0, 1, 8, 0, 1, 0, 1, 8, 0, 1, 0, 1, 0, 0, 1, 0};
   }

   private static void case_() {
      booleans0d81573182c03565b5bb298419afe0b7 = new boolean[]{false, true, false, false, false, true};
   }

   private static void protected_() {
      strings0d81573182c03565b5bb298419afe0b7 = new String[]{new String("Block not found"), new String("INSTANCE")};
   }

   private static void private_() {
      Object[] var0 = new Object[]{new rrqY_2(), null};
      var0[1] = new rrqY_2[]{(rrqY_2)var0[0]};
      staticFields0d81573182c03565b5bb298419afe0b7 = var0;
   }
}
