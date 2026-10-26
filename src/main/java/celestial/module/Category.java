/*
 * Decompiled with CFR 0.152.
 */
package celestial.module;

import celestial.rqO_2;

public enum Category {
    COMBAT("Combat", "combat", "\u041e\u0441\u043d\u043e\u0432\u043d\u044b\u0435"),
    MOVEMENT("Movement", "movement", "\u041e\u0441\u043d\u043e\u0432\u043d\u044b\u0435"),
    RENDER("Render", "render", "\u041e\u0441\u043d\u043e\u0432\u043d\u044b\u0435"),
    PLAYER("Player", "player", "\u041e\u0441\u043d\u043e\u0432\u043d\u044b\u0435"),
    UTIL("Util", "util", "\u041e\u0441\u043d\u043e\u0432\u043d\u044b\u0435"),
    CONFIGS("Configs", "configs", "\u0414\u0440\u0443\u0433\u0438\u0435"),
    THEMES("Themes", "themes", "\u0414\u0440\u0443\u0433\u0438\u0435"),
    AUTOBUY_ITEMS("Items", "autobuy_items", "\u0410\u0432\u0442\u043e\u0441\u043a\u0443\u043f"),
    AUTOBUY_HISTORY("History", "autobuy_history", "\u0410\u0432\u0442\u043e\u0441\u043a\u0443\u043f");

    public static Object[] staticFieldse67813cd60183787b1de54ac6b91c916;
    public Object[] fieldse67813cd60183787b1de54ac6b91c916;
    private final String name;
    private final String path;
    private final String group;
    private final rqO_2 icon;

    private Category(String name, String path, String group) {
        this.name = name;
        this.path = path;
        this.group = group;
        this.icon = new rqO_2("celestial/images/category/" + path + ".png");
    }

    public rqO_2 id_byte() {
        return this.icon;
    }

    public String id_class() {
        return this.group;
    }

    public String id_break() {
        return this.name;
    }
}

