package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntComparators;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public final class rkg_3 implements Predicate<rdn_3> {
   public static final rkg_3 id_class = new rkg_3(Stream.empty());
   private final rkR_2[] id_break;
   private rdn_3[] id_byte;
   private IntList id_protected;

   public JsonElement id_byte() {
      if (this.id_break.length == 1) {
         return this.id_break[0].id_break();
      } else {
         JsonArray var1 = new JsonArray();

         for (rkR_2 var5 : this.id_break) {
            var1.add(var5.id_break());
         }

         return var1;
      }
   }

   private rkg_3(Stream<? extends rkR_2> var1) {
      this.id_break = var1.toArray(rkR_2[]::new);
   }

   private static rkR_2 id_class(JsonObject var0) {
      if (var0.has("item") && var0.has("tag")) {
         throw new JsonParseException("An ingredient entry is either a tag or an item, not both");
      } else if (var0.has("item")) {
         rqO_2 var3 = new rqO_2(rpY_2.id_case(var0, "item"));
         rdb_3 var4 = rVL.id_for.id_break(var3).orElseThrow(() -> new JsonSyntaxException("Unknown item '" + var3 + "'"));
         return new rkY_2(new rdn_3(var4));
      } else if (var0.has("tag")) {
         rqO_2 var1 = new rqO_2(rpY_2.id_case(var0, "tag"));
         rlb_3 var2 = rlZ_2.id_class().id_break().id_class(var1);
         if (var2 == null) {
            throw new JsonSyntaxException("Unknown item tag '" + var1 + "'");
         } else {
            return new rko_3(var2);
         }
      } else {
         throw new JsonParseException("An ingredient entry needs either a tag or an item");
      }
   }

   public static rkg_3 id_class(JsonElement var0) {
      if (var0 == null || var0.isJsonNull()) {
         throw new JsonSyntaxException("Item cannot be null");
      } else if (var0.isJsonObject()) {
         return id_break(Stream.of(id_class(var0.getAsJsonObject())));
      } else if (var0.isJsonArray()) {
         JsonArray var1 = var0.getAsJsonArray();
         if (var1.size() == 0) {
            throw new JsonSyntaxException("Item array cannot be empty, at least one item must be defined");
         } else {
            return id_break(StreamSupport.<JsonElement>stream(var1.spliterator(), false).map(var0x -> id_class(rpY_2.id_private(var0x, "item"))));
         }
      } else {
         throw new JsonSyntaxException("Expected item to be object or array of objects");
      }
   }

   public boolean id_class(rdn_3 var1) {
      if (var1 == null) {
         return false;
      } else {
         this.id_throws();
         if (this.id_byte.length == 0) {
            return var1.id_class();
         } else {
            for (rdn_3 var5 : this.id_byte) {
               if (var5.id_break() == var1.id_break()) {
                  return true;
               }
            }

            return false;
         }
      }
   }

   public rdn_3[] id_class() {
      this.id_throws();
      return this.id_byte;
   }

   public void id_class(ruu_3 var1) {
      this.id_throws();
      var1.id_protected(this.id_byte.length);

      for (int var2 = 0; var2 < this.id_byte.length; var2++) {
         var1.id_class(this.id_byte[var2]);
      }
   }

   public static rkg_3 id_class(rpL_2... var0) {
      return id_class(Arrays.stream(var0).map(rdn_3::new));
   }

   public static rkg_3 id_class(rdn_3... var0) {
      return id_class(Arrays.stream(var0));
   }

   public static rkg_3 id_class(rlb_3<rdb_3> var0) {
      return id_break(Stream.of(new rko_3(var0)));
   }

   public static rkg_3 id_class(Stream<rdn_3> var0) {
      return id_break(var0.filter(var0x -> !var0x.id_class()).map(var0x -> new rkY_2(var0x)));
   }

   public IntList id_break() {
      if (this.id_protected == null) {
         this.id_throws();
         this.id_protected = new IntArrayList(this.id_byte.length);

         for (rdn_3 var4 : this.id_byte) {
            this.id_protected.add(rWr_1.id_byte(var4));
         }

         this.id_protected.sort(IntComparators.NATURAL_COMPARATOR);
      }

      return this.id_protected;
   }

   public static rkg_3 id_break(ruu_3 var0) {
      int var1 = var0.id_case();
      return id_break(Stream.<rkR_2>generate(() -> new rkY_2(var0.id_extends())).limit((long)var1));
   }

   private static rkg_3 id_break(Stream<? extends rkR_2> var0) {
      rkg_3 var1 = new rkg_3(var0);
      return var1.id_break.length == 0 ? id_class : var1;
   }

   private void id_throws() {
      if (this.id_byte == null) {
         this.id_byte = Arrays.stream(this.id_break).flatMap(var0 -> var0.id_class().stream()).distinct().toArray(rdn_3[]::new);
      }
   }

   public boolean id_protected() {
      return this.id_break.length == 0 && (this.id_byte == null || this.id_byte.length == 0) && (this.id_protected == null || this.id_protected.isEmpty());
   }
}
