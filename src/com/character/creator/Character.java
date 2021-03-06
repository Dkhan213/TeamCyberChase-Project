package com.character.creator;
import com.character.creator.backgroundAttributes.BackgroundAttribute;
import com.character.creator.physicalAttributes.PhysicalAttribute;

//ToDo: DynamoDb Mapping
public class Character {
    private PhysicalAttribute physicalAttribute;
    private BackgroundAttribute backgroundAttribute;

    public Character(PhysicalAttribute physicalAttribute, BackgroundAttribute backgroundAttribute) {
        this.physicalAttribute = physicalAttribute;
        this.backgroundAttribute = backgroundAttribute;
    }

    public PhysicalAttribute getPhysicalAttribute() {
        return physicalAttribute;
    }

    public void setPhysicalAttribute(PhysicalAttribute physicalAttribute) {
        this.physicalAttribute = physicalAttribute;
    }

    public BackgroundAttribute getBackgroundAttribute() {
        return backgroundAttribute;
    }

    public void setBackgroundAttribute(BackgroundAttribute backgroundAttribute) {
        this.backgroundAttribute = backgroundAttribute;
    }

    @Override
    public String toString() {
        return "Character: " + '\n' +
                physicalAttribute + '\n' + '\n' +
                backgroundAttribute;
    }

    public static Character createRandomCharacter() {
        PhysicalAttribute physicalAttribute = PhysicalAttribute.createRandomPhysicalAttribute();
        BackgroundAttribute backgroundAttribute = BackgroundAttribute.createRandomBackgroundAttribute();
        return new Character(physicalAttribute, backgroundAttribute);
    }
}
