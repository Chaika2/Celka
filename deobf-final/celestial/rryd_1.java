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

public enum rryd_1 implements MinecraftAccessor {
   ;
   public static Object[] staticFields78f62b0b61073300aba99f31bcf5126e;
   private static boolean[] booleans78f62b0b61073300aba99f31bcf5126e;
   private static short[] shorts78f62b0b61073300aba99f31bcf5126e;
   private static String[] strings78f62b0b61073300aba99f31bcf5126e;
   public Object[] fields78f62b0b61073300aba99f31bcf5126e;
   private static byte[] bytes78f62b0b61073300aba99f31bcf5126e;

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{28, -86, 119, -114, -82, -96, -67, 6}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public List<rryz_1> byte_() {
      return (List<rryz_1>)this.fields78f62b0b61073300aba99f31bcf5126e[1];
   }

   private rryd_1() {
      this.implements_();
      HashSet var7 = new HashSet();
      this.fields78f62b0b61073300aba99f31bcf5126e[0] = var7;
      ArrayList var8 = new ArrayList();
      this.fields78f62b0b61073300aba99f31bcf5126e[1] = var8;
      this.class_(new rryW());
   }

   static {
      ntfClinit();
   }

   public void class_(String var1, String var2, boolean var3, boolean var4) {
      if (var1.equalsIgnoreCase(import_.while_().byte_())) {
         ((List)this.fields78f62b0b61073300aba99f31bcf5126e[1]).forEach(rryz_1::byte_);
      } else {
         if (var4) {
            for (rryk_1 var6 : (Set)this.fields78f62b0b61073300aba99f31bcf5126e[0]) {
               if (var6.break_().equalsIgnoreCase(var1.toLowerCase())) {
                  ((List)this.fields78f62b0b61073300aba99f31bcf5126e[1]).forEach(var1x -> var1x.class_(var1, false));
                  return;
               }
            }
         }

         boolean var7 = ((Set)this.fields78f62b0b61073300aba99f31bcf5126e[0]).add(new rryk_1(var1, var2));
         if (var3) {
            ((List)this.fields78f62b0b61073300aba99f31bcf5126e[1]).forEach(var2x -> var2x.class_(var1, var7));
         }
      }
   }

   public void class_(Consumer<rryk_1> var1) {
      if (((Set)this.fields78f62b0b61073300aba99f31bcf5126e[0]).isEmpty()) {
         ((List)this.fields78f62b0b61073300aba99f31bcf5126e[1]).forEach(rryz_1::break_);
      } else {
         ((Set)this.fields78f62b0b61073300aba99f31bcf5126e[0]).forEach(var1);
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1003116860;
   }

   public int class_() {
      return ((Set)this.fields78f62b0b61073300aba99f31bcf5126e[0]).size();
   }

   public void class_(boolean var1) {
      if (((Set)this.fields78f62b0b61073300aba99f31bcf5126e[0]).isEmpty()) {
         if (var1) {
            ((List)this.fields78f62b0b61073300aba99f31bcf5126e[1]).forEach(rryz_1::break_);
         }
      } else {
         ((Set)this.fields78f62b0b61073300aba99f31bcf5126e[0]).clear();
         if (var1) {
            ((List)this.fields78f62b0b61073300aba99f31bcf5126e[1]).forEach(rryz_1::class_);
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7387091375054086736L;
   }

   public boolean class_(String var1) {
      return ((Set)this.fields78f62b0b61073300aba99f31bcf5126e[0]).stream().anyMatch(var1x -> var1x.break_().equalsIgnoreCase(var1));
   }

   public void class_(rryz_1 var1) {
      ((List)this.fields78f62b0b61073300aba99f31bcf5126e[1]).add(var1);
   }

   public void break_(String var1) {
      rryk_1 var2 = this.protected_(var1);
      if (var2 == null) {
         ((List)this.fields78f62b0b61073300aba99f31bcf5126e[1]).forEach(var1x -> var1x.class_(var1));
      } else {
         ((List)this.fields78f62b0b61073300aba99f31bcf5126e[1]).forEach(var3 -> var3.break_(var2.break_(), this.class_(var1)));
         ((Set)this.fields78f62b0b61073300aba99f31bcf5126e[0]).removeIf(var1x -> var1x.break_().equals(var1));
      }
   }

   public Set<rryk_1> break_() {
      return (Set<rryk_1>)this.fields78f62b0b61073300aba99f31bcf5126e[0];
   }

   private static void throws_() {
      bytes78f62b0b61073300aba99f31bcf5126e = new byte[]{2, 2};
   }

   private static void finally_() {
      booleans78f62b0b61073300aba99f31bcf5126e = new boolean[]{false, true, false, false, false, true};
   }

   private static void case_() {
      strings78f62b0b61073300aba99f31bcf5126e = new String[]{new String("INSTANCE")};
   }

   private void implements_() {
      if (this.fields78f62b0b61073300aba99f31bcf5126e == null) {
         this.fields78f62b0b61073300aba99f31bcf5126e = new Object[2];
      }
   }

   private static void protected_() {
      shorts78f62b0b61073300aba99f31bcf5126e = new short[]{1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0};
   }

   public rryk_1 protected_(String var1) {
      return ((Set)this.fields78f62b0b61073300aba99f31bcf5126e[0]).stream().filter(var1x -> var1x.break_().equalsIgnoreCase(var1)).findFirst().orElse(null);
   }

   private static void private_() {
      Object[] var0 = new Object[]{new rryd_1(), null};
      var0[1] = new rryd_1[]{(rryd_1)var0[0]};
      staticFields78f62b0b61073300aba99f31bcf5126e = var0;
   }
}
