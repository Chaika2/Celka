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

public enum rrqM_2 implements MinecraftAccessor {
   ;
   private static String[] strings360b36d126ee3c45b942181ce786df43;
   public static Object[] staticFields360b36d126ee3c45b942181ce786df43;
   private static byte[] bytes360b36d126ee3c45b942181ce786df43;
   public Object[] fields360b36d126ee3c45b942181ce786df43;
   private static short[] shorts360b36d126ee3c45b942181ce786df43;
   private static boolean[] booleans360b36d126ee3c45b942181ce786df43;

   public Set<String> byte_() {
      return (Set<String>)this.fields360b36d126ee3c45b942181ce786df43[0];
   }

   public void byte_(String var1) {
      String var2 = this.protected_(var1);
      if (var2 == null) {
         ((List)this.fields360b36d126ee3c45b942181ce786df43[1]).forEach(var1x -> var1x.d_(var1));
      } else {
         ((List)this.fields360b36d126ee3c45b942181ce786df43[1]).forEach(var1x -> var1x.class_(var2, true));
         ((Set)this.fields360b36d126ee3c45b942181ce786df43[0]).remove(var2);
      }
   }

   private rrqM_2() {
      this.implements_();
      HashSet var7 = new HashSet();
      this.fields360b36d126ee3c45b942181ce786df43[0] = var7;
      ArrayList var8 = new ArrayList();
      this.fields360b36d126ee3c45b942181ce786df43[1] = var8;
      this.class_(new rrqh_3());
   }

   static {
      ntfClinit();
   }

   public void class_(boolean var1) {
      if (((Set)this.fields360b36d126ee3c45b942181ce786df43[0]).isEmpty()) {
         if (var1) {
            ((List)this.fields360b36d126ee3c45b942181ce786df43[1]).forEach(rrqO_2::break_);
         }
      } else {
         ((Set)this.fields360b36d126ee3c45b942181ce786df43[0]).clear();
         if (var1) {
            ((List)this.fields360b36d126ee3c45b942181ce786df43[1]).forEach(rrqO_2::continue_);
         }
      }
   }

   public void class_(Consumer<String> var1) {
      if (((Set)this.fields360b36d126ee3c45b942181ce786df43[0]).isEmpty()) {
         ((List)this.fields360b36d126ee3c45b942181ce786df43[1]).forEach(rrqO_2::break_);
      } else {
         ((Set)this.fields360b36d126ee3c45b942181ce786df43[0]).forEach(var1);
      }
   }

   public void class_(String var1, boolean var2, boolean var3) {
      if (var1.length() > 16 || var1.length() < 2) {
         ((List)this.fields360b36d126ee3c45b942181ce786df43[1]).forEach(rrqO_2::aM_);
      } else if (var1.equalsIgnoreCase(import_.while_().byte_())) {
         ((List)this.fields360b36d126ee3c45b942181ce786df43[1]).forEach(rrqO_2::aN_);
      } else {
         if (var3) {
            for (String var5 : (Set)this.fields360b36d126ee3c45b942181ce786df43[0]) {
               if (var5.equalsIgnoreCase(var1.toLowerCase())) {
                  ((List)this.fields360b36d126ee3c45b942181ce786df43[1]).forEach(var1x -> var1x.d_(var1, false));
                  return;
               }
            }
         }

         boolean var6 = ((Set)this.fields360b36d126ee3c45b942181ce786df43[0]).add(var1);
         if (var2) {
            ((List)this.fields360b36d126ee3c45b942181ce786df43[1]).forEach(var2x -> var2x.d_(var1, var6));
         }
      }
   }

   public void class_(rrqO_2 var1) {
      ((List)this.fields360b36d126ee3c45b942181ce786df43[1]).add(var1);
   }

   public int class_() {
      return ((Set)this.fields360b36d126ee3c45b942181ce786df43[0]).size();
   }

   public boolean class_(String var1) {
      return ((Set)this.fields360b36d126ee3c45b942181ce786df43[0]).stream().anyMatch(var1x -> var1x.equalsIgnoreCase(var1));
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2453120276632808051L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -634159326;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-36, 10, -31, -6, 104, -98, -32, -38}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void break_() {
      rrwe_3 var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).throws_();
      boolean var2 = var1.class_((rrwU_2)var1.case_(), false);
      ((List)this.fields360b36d126ee3c45b942181ce786df43[1]).forEach(var1x -> var1x.f_(var2));
   }

   private static void throws_() {
      shorts360b36d126ee3c45b942181ce786df43 = new short[]{1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0};
   }

   private static void finally_() {
      Object[] var0 = new Object[]{new rrqM_2(), null};
      var0[1] = new rrqM_2[]{(rrqM_2)var0[0]};
      staticFields360b36d126ee3c45b942181ce786df43 = var0;
   }

   private static void catch_() {
      bytes360b36d126ee3c45b942181ce786df43 = new byte[]{16, 2, 2, 2};
   }

   private static void extends_() {
      booleans360b36d126ee3c45b942181ce786df43 = new boolean[]{false, true, false, true, false, false, false, true};
   }

   private void implements_() {
      if (this.fields360b36d126ee3c45b942181ce786df43 == null) {
         this.fields360b36d126ee3c45b942181ce786df43 = new Object[2];
      }
   }

   public List<rrqO_2> protected_() {
      return (List<rrqO_2>)this.fields360b36d126ee3c45b942181ce786df43[1];
   }

   public String protected_(String var1) {
      return ((Set)this.fields360b36d126ee3c45b942181ce786df43[0]).stream().filter(var1x -> var1x.equalsIgnoreCase(var1)).findFirst().orElse(null);
   }

   private static void private_() {
      strings360b36d126ee3c45b942181ce786df43 = new String[]{new String("INSTANCE")};
   }
}
