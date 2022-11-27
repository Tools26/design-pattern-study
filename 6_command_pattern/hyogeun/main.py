# Vi Editor
# Mode controller

from abc import ABCMeta, abstractmethod

class Command(metaclass=ABCMeta):
    @abstractmethod
    def execute(self):
        pass

class EditCommand(Command):
    def __init__(self, receiver):
        self.receiver = receiver

    def execute(self):
        self.receiver.edit()

class EraseCommand(Command):
    def __init__(self, receiver):
        self.receiver = receiver

    def execute(self):
        self.receiver.erase()

class SaveCommand(Command):
    def __init__(self, receiver):
        self.receiver = receiver

    def execute(self):
        self.receiver.save()

class ViEditor:
    def edit(self):
        print('Cur mode : Edit')

    def erase(self):
        print('Cur mode : Erase')
    
    def save(self):
        print("Cur mode : save")

class EditorModeInvoke:
    def __init__(self, edit, erase, save):
        self._edit = edit
        self._erase = erase
        self._save = save

    def edit(self):
        self._edit.execute()

    def erase(self):
        self._erase.execute()
        
    def save(self):
        self._save.execute()

if __name__ == "__main__":
    vi_editor = ViEditor()
    edit_command = EditCommand(vi_editor)
    erase_command = EraseCommand(vi_editor)
    save_command = SaveCommand(vi_editor)

    mode_invoke = EditorModeInvoke(edit_command, erase_command, save_command)

    mode_invoke.edit()
    mode_invoke.erase()
    mode_invoke.save()