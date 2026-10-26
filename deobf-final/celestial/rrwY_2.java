package celestial;

import com.google.gson.JsonObject;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.io.FilenameUtils;

public class rrwY_2 implements rrZS<rrwR_2> {
   public Object[] break_;
   private static String[] byte_;
   private static byte[] protected_;
   private static boolean[] throws_;
   private static short[] case_;

   @Override
   public boolean byte_(String var1, boolean var2) {
      rrwR_2 var3 = this.break_(var1);
      boolean var4 = false;
      if (var3 == null) {
         var3 = new rrwR_2(var1);
         ((Map)this.break_[0]).put(var1, var3);
         var4 = true;
      }

      return this.break_(var3, var4);
   }

   public boolean byte_(rrwR_2 var1, boolean var2) {
      try {
         JsonObject var3 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[case_[9]]).break_().break_(var1.class_()).getAsJsonObject();
         if (var3 == null) {
            return throws_[8];
         } else {
            var1.class_(var3);
            if (var2) {
               ((List)this.break_[case_[10]]).forEach(var1x -> var1x.class_(var1.break_()));
            }

            this.break_[case_[11]] = var1;
            return throws_[9];
         }
      } catch (Exception var9) {
         return false;
      }
   }

   public List<rrwK_2> byte_() {
      return (List<rrwK_2>)this.break_[2];
   }

   public void byte_(boolean var1) {
      this.class_(var1);
      this.class_();
   }

   public boolean byte_(String var1) {
      return ((Map)this.break_[0]).entrySet().stream().anyMatch(var1x -> ((String)var1x.getKey()).equalsIgnoreCase(var1.toLowerCase()));
   }

   public rrwY_2() {
      this.implements_();
      HashMap var5 = new HashMap();
      this.break_[0] = var5;
      ArrayList var6 = new ArrayList();
      this.break_[1] = var6;
      ArrayList var7 = new ArrayList();
      this.break_[2] = var7;
      this.catch_();
   }

   static {
      ntfClinit();
   }

   public boolean class_(rrwR_2 var1) {
      return var1.break_().equals("autocfg");
   }

   @Override
   public void class_() {
      for (rrwR_2 var2 : this.break_()) {
         if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).break_().class_(var2.class_())) {
            this.class_(var2, true);
         }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1189278088;
   }

   private void class_(rrwj_3... var1) {
      ((List)this.break_[1]).addAll(List.of(var1));
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6293477874635692303L;
   }

   public void class_(rrwK_2... var1) {
      ((List)this.break_[2]).addAll(List.of(var1));
   }

   @Override
   public void class_(boolean var1) {
      File var2 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).break_().class_("creeperfarm");
      File[] var3 = var2.listFiles();
      if (var3 != null) {
         for (File var7 : var3) {
            if (FilenameUtils.getExtension(var7.getName()).equals(".celka".substring(1))) {
               String var8 = FilenameUtils.removeExtension(var7.getName());
               rrwR_2 var9 = new rrwR_2(var8);
               if (var1 && !((Map)this.break_[0]).containsKey(var8)) {
                  ((List)this.break_[2]).forEach(var1x -> var1x.byte_(var9.break_()));
               }

               ((Map)this.break_[0]).put(var8, var9);
            }
         }
      }
   }

   @Override
   public boolean class_(String var1, boolean var2) {
      rrwR_2 var3 = this.break_(var1);
      if (var3 == null) {
         if (var2) {
            ((List)this.break_[2]).forEach(var1x -> var1x.break_(var1));
         }

         return throws_[7];
      } else {
         return this.byte_(var3, var2);
      }
   }

   public boolean class_(rrwR_2 var1, boolean var2) {
      File var3 = var1.class_();
      ((Map)this.break_[0]).remove(var1.break_());
      if (var2 && !this.class_(var1)) {
         ((List)this.break_[2]).forEach(var1x -> var1x.throws_(var1.break_()));
      }

      return var3.exists() && var3.delete() ? true : throws_[17];
   }

   @Override
   public void break_(boolean var1) {
      for (rrwR_2 var3 : ((Map)this.break_[0]).values()) {
         this.byte_(var3, var1);
      }
   }

   public rrwR_2 break_(String var1) {
      if (((Map)this.break_[0]).containsKey(var1)) {
         return (rrwR_2)((Map)this.break_[0]).get(var1);
      } else {
         File var2 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).break_().class_("creeperfarm");
         return new File(var2, var1 + ".celka").exists() ? new rrwR_2(var1) : null;
      }
   }

   @Override
   public boolean break_(String var1, boolean var2) {
      rrwR_2 var3 = this.break_(var1);
      if (var3 == null) {
         if (var2) {
            ((List)this.break_[2]).forEach(var1x -> var1x.break_(var1));
         }

         return throws_[15];
      } else {
         return this.class_(var3, var2);
      }
   }

   public boolean break_(rrwR_2 var1, boolean var2) {
      if (var1 == null) {
         return false;
      } else {
         JsonObject var3 = new JsonObject();
         var1.break_(var3);
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).break_().class_(var1.class_(), var3);
         if (var2) {
            if (!this.class_(var1) && var1 != this.case_()) {
               ((List)this.break_[2]).forEach(var1x -> var1x.byte_(var1.break_()));
            }
         } else {
            ((List)this.break_[2]).forEach(var1x -> var1x.protected_(var1.break_()));
         }

         return throws_[14];
      }
   }

   @Override
   public Collection<rrwR_2> break_() {
      return ((Map)this.break_[0]).values().stream().filter(var1 -> !this.class_(var1) ? true : throws_[20]).toList();
   }

   public Map<String, rrwR_2> throws_() {
      return (Map<String, rrwR_2>)this.break_[0];
   }

   private static void finally_() {
      case_ = new short[]{0, 1, 2, 0, 0, 2, 0, 2, 0, 0, 2, 3, 0, 0, 2, 2, 0, 0, 0, 2, 0, 2, 0, 0, 0, 3, 1, 0, 2, 2, 1};
   }

   private void catch_() {
      this.class_(new rrwD_2());
      this.class_(new rrwo_3());
      this.class_(false);
   }

   private static void extends_() {
      protected_ = new byte[]{4};
   }

   public rrwR_2 case_() {
      return (rrwR_2)this.break_[3];
   }

   private void implements_() {
      if (this.break_ == null) {
         this.break_ = new Object[4];
         Object[] var1 = this.break_;
      }
   }

   public List<rrwj_3> protected_() {
      return (List<rrwj_3>)this.break_[1];
   }

   public static String protected_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-128, 35, -114, 103, -104, -91, -94, 51}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void private_() {
      throws_ = new boolean[]{
         true, false, true, false, false, false, true, false, false, true, false, false, true, false, true, false, true, false, true, true, false
      };
   }

   private static void native_() {
      byte_ = new String[]{new String("creeperfarm"), new String(".celka"), new String("creeperfarm"), new String("autocfg")};
   }
}
