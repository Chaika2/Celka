package celestial;

import it.unimi.dsi.fastutil.ints.IntArraySet;
import it.unimi.dsi.fastutil.ints.IntCollection;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.stream.IntStream;
import org.lwjgl.stb.STBTTFontinfo;
import org.lwjgl.stb.STBTruetype;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;

public class uF_2 implements uc_3 {
   private final ByteBuffer id_class;
   final STBTTFontinfo id_break;
   final float id_byte;
   private final IntSet id_protected = new IntArraySet();
   final float id_throws;
   final float id_case;
   final float id_catch;
   final float id_private;

   public uF_2(ByteBuffer var1, STBTTFontinfo var2, float var3, float var4, float var5, float var6, String var7) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var4;
      var7.codePoints().forEach(this.id_protected::add);
      this.id_throws = var5 * var4;
      this.id_case = var6 * var4;
      this.id_catch = STBTruetype.stbtt_ScaleForPixelHeight(var2, var3 * var4);
      MemoryStack var8 = MemoryStack.stackPush();

      try {
         IntBuffer var9 = var8.mallocInt(1);
         IntBuffer var10 = var8.mallocInt(1);
         IntBuffer var11 = var8.mallocInt(1);
         STBTruetype.stbtt_GetFontVMetrics(var2, var9, var10, var11);
         this.id_private = (float)var9.get(0) * this.id_catch;
      } catch (Throwable var13) {
         if (var8 != null) {
            try {
               var8.close();
            } catch (Throwable var12) {
               var13.addSuppressed(var12);
            }
         }

         throw var13;
      }

      if (var8 != null) {
         var8.close();
      }
   }

   @Override
   public IntSet id_class() {
      return IntStream.range(0, 65535)
         .filter(var1 -> !this.id_protected.contains(var1))
         .collect(IntOpenHashSet::new, IntCollection::add, IntCollection::addAll);
   }

   @Override
   public void close() {
      this.id_break.free();
      MemoryUtil.memFree(this.id_class);
   }

   public uL_2 id_break(int var1) {
      if (this.id_protected.contains(var1)) {
         return null;
      } else {
         MemoryStack var3 = MemoryStack.stackPush();

         uL_2 var13;
         label61: {
            Object var11;
            label62: {
               Object var2;
               try {
                  IntBuffer var4 = var3.mallocInt(1);
                  IntBuffer var5 = var3.mallocInt(1);
                  IntBuffer var6 = var3.mallocInt(1);
                  IntBuffer var7 = var3.mallocInt(1);
                  int var8 = STBTruetype.stbtt_FindGlyphIndex(this.id_break, var1);
                  if (var8 != 0) {
                     STBTruetype.stbtt_GetGlyphBitmapBoxSubpixel(
                        this.id_break, var8, this.id_catch, this.id_catch, this.id_throws, this.id_case, var4, var5, var6, var7
                     );
                     int var9 = var6.get(0) - var4.get(0);
                     int var10 = var7.get(0) - var5.get(0);
                     if (var9 != 0 && var10 != 0) {
                        IntBuffer var16 = var3.mallocInt(1);
                        IntBuffer var12 = var3.mallocInt(1);
                        STBTruetype.stbtt_GetGlyphHMetrics(this.id_break, var8, var16, var12);
                        var13 = new uL_2(
                           this,
                           var4.get(0),
                           var6.get(0),
                           -var5.get(0),
                           -var7.get(0),
                           (float)var16.get(0) * this.id_catch,
                           (float)var12.get(0) * this.id_catch,
                           var8
                        );
                        break label61;
                     }

                     var11 = null;
                     break label62;
                  }

                  var2 = null;
               } catch (Throwable var15) {
                  if (var3 != null) {
                     try {
                        var3.close();
                     } catch (Throwable var14) {
                        var15.addSuppressed(var14);
                     }
                  }

                  throw var15;
               }

               if (var3 != null) {
                  var3.close();
               }

               return (uL_2)var2;
            }

            if (var3 != null) {
               var3.close();
            }

            return (uL_2)var11;
         }

         if (var3 != null) {
            var3.close();
         }

         return var13;
      }
   }
}
