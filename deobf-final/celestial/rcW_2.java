package celestial;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class rcW_2 {
   public static rcd_3 class_(DataInput var0, rcg_3 var1) throws IOException {
      rcZ_2 var2 = class_(var0, 0, var1);
      if (var2 instanceof rcd_3) {
         return (rcd_3)var2;
      } else {
         throw new IOException("Root tag must be a named compound tag");
      }
   }

   public static rcd_3 class_(DataInput var0) throws IOException {
      return class_(var0, rcg_3.class_);
   }

   private static rcZ_2 class_(DataInput var0, int var1, rcg_3 var2) throws IOException {
      byte var3 = var0.readByte();
      if (var3 == 0) {
         return rcN_2.break_;
      } else {
         var0.readUTF();

         try {
            return rcY_2.class_(var3).break_(var0, var1, var2);
         } catch (IOException var7) {
            KY var5 = KY.class_(var7, "Loading NBT data");
            Ko_1 var6 = var5.class_("NBT Tag");
            var6.class_("Tag type", var3);
            throw new KU(var5);
         }
      }
   }

   public static void class_(rcd_3 var0, DataOutput var1) throws IOException {
      class_((rcZ_2)var0, var1);
   }

   private static void class_(rcZ_2 var0, DataOutput var1) throws IOException {
      var1.writeByte(var0.class_());
      if (var0.class_() != 0) {
         var1.writeUTF("");
         var0.class_(var1);
      }
   }

   public static rcd_3 class_(File var0) throws IOException {
      rcd_3 var1;
      try (FileInputStream var2 = new FileInputStream(var0)) {
         var1 = class_(var2);
      }

      return var1;
   }

   public static void class_(rcd_3 var0, File var1) throws IOException {
      try (FileOutputStream var2 = new FileOutputStream(var1)) {
         class_(var0, var2);
      }
   }

   public static void class_(rcd_3 var0, OutputStream var1) throws IOException {
      try (DataOutputStream var2 = new DataOutputStream(new BufferedOutputStream(new GZIPOutputStream(var1)))) {
         class_(var0, (DataOutput)var2);
      }
   }

   public static rcd_3 class_(InputStream var0) throws IOException {
      rcd_3 var1;
      try (DataInputStream var2 = new DataInputStream(new BufferedInputStream(new GZIPInputStream(var0)))) {
         var1 = class_(var2, rcg_3.class_);
      }

      return var1;
   }

   public static rcd_3 break_(File var0) throws IOException {
      if (!var0.exists()) {
         return null;
      } else {
         rcd_3 var1;
         try (
            FileInputStream var2 = new FileInputStream(var0);
            DataInputStream var3 = new DataInputStream(var2);
         ) {
            var1 = class_(var3, rcg_3.class_);
         }

         return var1;
      }
   }

   public static void break_(rcd_3 var0, File var1) throws IOException {
      try (
         FileOutputStream var2 = new FileOutputStream(var1);
         DataOutputStream var3 = new DataOutputStream(var2);
      ) {
         class_(var0, (DataOutput)var3);
      }
   }
}
